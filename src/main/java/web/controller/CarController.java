package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
public class CarController {
    private Car car;
    private CarService carService;

    public CarController(Car car, CarService carService) {
        this.car = car;
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count.intValue()));
        model.addAttribute("header", car.header());
        return "cars";
    }


}
