package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsContoller {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") Integer n, Model model) {
        model.addAttribute("cars", carService.getCars(n));
        return "cars";
    }
}
