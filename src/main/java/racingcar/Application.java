package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import racingcar.controller.RaceController;

public class Application {
    public static void main(String[] args) {
        RaceController raceController = new RaceController();
        raceController.Run();
    }
}
        List<String> winners = findWinners(names, carPositions);
        printWinners(winners);
    }

    private static boolean move(int random) {
        return random >= 4;
    }

    private static void printRoundResult(List<String> names, List<Integer> carPositions) {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            int position = carPositions.get(i);
            System.out.println(name + " : " + "-".repeat(position));
        }

        System.out.println();
    }

    private static List<String> findWinners(List<String> names, List<Integer> carPositions) {
        int maxPosition = Collections.max(carPositions);
        List <String> winners = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if (carPositions.get(i) == maxPosition) {
                winners.add(names.get(i));
            }
        }

        return winners;
    }

    private static void printWinners(List<String> winners) {
        String winner = String.join(", ", winners);
        System.out.println("최종 우승자 : " + winner);
    }
}