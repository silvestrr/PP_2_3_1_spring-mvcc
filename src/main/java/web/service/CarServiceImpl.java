package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.mоdel.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService{

    private final CarDaoImpl carDao;
    @Autowired
    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    public List<Car> saveCar() {
        return carDao.saveCar();
    }
    @Override
    public List<Car> getSpecifiedByNumberOfCars(int count) {
        return carDao.getCars().stream().limit(count).toList();
    }


}
