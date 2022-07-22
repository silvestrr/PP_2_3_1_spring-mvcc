package web.service;

import web.modelсar.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
}