package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCarsByCount(Model model, @RequestParam(defaultValue = "100") int count) {
        model.addAttribute("cars", carService.getCarsByCount(count));
        return "cars";
    }
}

