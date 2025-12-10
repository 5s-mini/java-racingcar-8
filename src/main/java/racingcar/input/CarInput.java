package racingcar.input;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class CarInput {

    private final MoveInput moveInput;

    public CarInput(){
        this.moveInput = new MoveInput();
    }

    public void Start() {
        String carInput = Input();
        List<String> names = carNames(carInput);
        moveInput.Attempts(names.size());
    }

    public String Input() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    private static List<String> carNames(String carInput) {
        String[] carName = carInput.split(",");
        List<String> names = new ArrayList<>();
        for (String r : carName) {
            if (r == null) {
                throw new IllegalArgumentException("자동차 이름이 null이에요.");
            }

            String name = r.trim();

            if (name.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름이 없어요.");
            }

            if (name.length() > 5) {
                throw new IllegalArgumentException(name + " 의 이름을 5자 이하로 지정해 주세요.");
            }

            names.add(name);
        }
        return names;
    }
}