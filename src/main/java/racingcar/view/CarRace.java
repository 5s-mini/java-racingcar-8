package racingcar.view;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class CarRace {

    public static void initPositions(int num) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            positions.add(0);
        }

    }

    public static void startRace(List<String> names, List<Integer> carPositions, int attempts) {
        for (int round = 0; round < attempts; round++) {
            for (int i = 0; i < names.size(); i++) {
                int random = Randoms.pickNumberInRange(0, 9);
                if (move(random)) {
                    carPositions.set(i, carPositions.get(i) + 1);
                }
            }

            System.out.println();
            printRoundResult(names, carPositions);
        }
    }
}