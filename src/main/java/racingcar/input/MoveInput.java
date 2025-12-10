package racingcar.input;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.CarRace;

public class MoveInput {

    private final CarRace carRace;

    public MoveInput(){
        this.carRace = new CarRace();
    }

    public int Attempts(int names) {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String attemptsInput = Console.readLine();
        int attempts = attemptsNum(attemptsInput);
        return attempts;
    }

    private static int attemptsNum(String attemptsInput) {
        if (attemptsInput == null) {
            throw new IllegalArgumentException("시도 횟수가 null이에요.");
        }

        String num = attemptsInput.trim();
        if (num.isBlank()) {
            throw new IllegalArgumentException("시도 횟수를 입력해 주세요.");
        }

        int attempts = 0;

        try {
            attempts = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수를 정수로 입력해 주세요.");
        }

        if (attempts < 1) {
            throw new IllegalArgumentException("시도 횟수를 1 이상의 정수로 입력해 주세요.");
        }

        return attempts;
    }
}
