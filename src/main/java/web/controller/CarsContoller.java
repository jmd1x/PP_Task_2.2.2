package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsContoller {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") Integer n, ModelMap model) {
        model.addAttribute("cars", carService.getCars(n));
        return "cars";
    }
}