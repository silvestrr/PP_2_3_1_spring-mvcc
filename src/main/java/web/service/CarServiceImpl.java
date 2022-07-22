package web.service;

import web.modelсar.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    private List<Car> cars = new ArrayList<>();


    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
    public CarServiceImpl() {
        cars.add(new Car(1, "BMW", "X6"));
        cars.add(new Car(2, "Mercedes", "e200"));
        cars.add(new Car(3, "Volkswagen", "polo"));
        cars.add(new Car(4, "Ford", "Mustang"));
        cars.add(new Car(5, "car5", "car5"));
    }
}
