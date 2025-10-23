package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carInput = Console.readLine();
        List<String> names = carNames(carInput);

        System.out.println("시도할 횟수는 몇 회인가요?");
        String attemptsInput = Console.readLine();
        int attempts = attemptsNum(attemptsInput);

        List<Integer> carPositions = initPositions(names.size());
        startRace(names, carPositions, attempts);
    }

    private static List<String> carNames(String carInput) {
        if (carInput == null) {
            throw new IllegalArgumentException("자동차 이름을 입력해 주세요.");
        }

        String[] carName = carInput.split(",");
        List<String> names = new ArrayList<>();
        for (String r : carName) {
            if (r == null) {
                throw new IllegalArgumentException("잘못된 이름이 포함되어 있어요.");
            }

            String name = r.trim();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름이 없어요.");
            }

            if (name.length() > 5) {
                throw new IllegalArgumentException(name + "의 이름을 5자 이하로 지정해 주세요.");
            }

            names.add(name);
        }

        if (names.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름이 없어요.");
        }

        return names;
    }

    private static int attemptsNum(String attemptsInput) {
        if (attemptsInput == null) {
            throw new IllegalArgumentException("시도 횟수를 입력해 주세요.");
        }

        String num = attemptsInput.trim();
        if (num.isEmpty()) {
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

    private static List<Integer> initPositions(int num) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            positions.add(0);
        }

        return positions;
    }

    private static void startRace(List<String> names, List<Integer> carPositions, int attempts) {
        for (int round = 0; round < attempts; round++) {
            for (int i = 0; i < names.size(); i++) {
                int random = Randoms.pickNumberInRange(0, 9);
                if (move(random)) {
                    carPositions.set(i, carPositions.get(i) + 1);
                }
            }
        }
    }

    private static boolean move(int random) {
        return random >= 4;
    }
}