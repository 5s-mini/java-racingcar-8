package racingcar.controller;

import racingcar.input.CarInput;

public class RaceController {

    private final CarInput carInput;

    public RaceController() {
        this.carInput = new CarInput();
    }

    public void Run() {
        try {
            carInput.Start();
        } catch(IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}