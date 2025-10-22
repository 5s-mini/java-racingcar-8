package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carInput = Console.readLine();
        List<String> names = carNames(carInput);

        System.out.println("시도할 횟수는 몇 회인가요?");
        String attemptsInput = Console.readLine();
    }

    private static List<String> carNames(String carInput) {
        if (carInput == null) {
            throw new IllegalArgumentException("자동차 이름을 입력해야 합니다.");
        }

        String[] carName = carInput.split(",");
        List<String> names = new ArrayList<>();
        for (String r : carName) {
            if (r == null) {
                throw new IllegalArgumentException("잘못된 이름이 포함되어 있습니다.");
            }

            String name = r.trim();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름이 없습니다.");
            }

            if (name.length() > 5) {
                throw new IllegalArgumentException("이름은 5자 이하만 가능합니다: " + name);
            }

            names.add(name);
        }

        if (names.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름이 없습니다.");
        }

        return names;
    }
}