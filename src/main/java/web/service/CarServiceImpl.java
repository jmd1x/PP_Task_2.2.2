package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "M8", 2023));
        cars.add(new Car("Mercedes Benz", "S350", 2020));
        cars.add(new Car("Volvo", "S90", 2018));
        cars.add(new Car("Fiat", "500", 2016));
        cars.add(new Car("ВАЗ", "2107", 1980));
    }

    @Override
    public List<Car> getCars(int n) {
        List<Car> cars1 = cars;
        if (n < cars.size()) {
            cars1 = cars.subList(0, n);
            return cars1;
        } else {
            return cars;
        }
    }
}
