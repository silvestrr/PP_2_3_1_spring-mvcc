package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.mоdel.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService{

    private final CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarsByModelAndSeries(int count) {
        return carDao.getCars().stream().limit(count).toList();
    }


}
