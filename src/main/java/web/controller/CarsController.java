package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {
    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String ListOfСars(@RequestParam(required = false) Integer count, Model model) {
        List<Car> cas1 = carService.getCarList(count == null ? 0 : count);
        model.addAttribute(cas1);
        return "pagesCar/cars";
    }

}
