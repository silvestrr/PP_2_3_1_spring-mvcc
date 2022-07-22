package web.dao;

import org.springframework.stereotype.Component;
import web.mоdel.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(1, "BMW", "X6"));
        cars.add(new Car(2, "Mercedes", "e200"));
        cars.add(new Car(3, "Volkswagen", "polo"));
        cars.add(new Car(4, "Ford", "Mustang"));
        cars.add(new Car(5, "car5", "car5"));
    }
    public List<Car> getCars() {return cars;}


}
