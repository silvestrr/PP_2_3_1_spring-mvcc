package web.service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList(int count);
}