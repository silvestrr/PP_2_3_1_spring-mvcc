package web.service;

import web.mоdel.Car;

import java.util.List;

public interface CarService {
    List<Car> saveCar();
    List<Car> getSpecifiedByNumberOfCars(int count);
}