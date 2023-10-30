package racingcar.controller;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.Car;
import racingcar.domain.ProgressState;
import racingcar.view.ConsoleInput;

public class CarManager {
    private static List<Car> carList;

    public static void makeCarList(List<String> carNames) {
        carList = carNames.stream()
                .map(Car::create)
                .collect(Collectors.toList());
    }

    public static void proceed() {
        carList.forEach(CarManager::proceedEachCar);
    }

    public static ProgressState getState() {
        return ProgressState.create(carList);
    }

    private static void proceedEachCar(Car car) {
        int progress = ConsoleInput.inputProgress();
        car.go(progress);
    }

}
