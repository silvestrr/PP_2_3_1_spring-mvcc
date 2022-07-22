package web.service;

import web.mоdel.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
}