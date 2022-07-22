package web.dao;

import web.mоdel.Car;

import java.util.List;

public interface CarDao {
    List<Car> saveCar();
    List<Car> getCars ();
}