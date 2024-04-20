package web.service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    List<Car> carList = List.of(
            (new Car("Toyota Camry", "Green", 2018)),
            (new Car("Ford Mustang", "Black", 2011)),
            (new Car("Honda Civic", "White", 2012)),
            (new Car("Volkswagen Golf", "Purple", 2015)),
            (new Car("Mercedes Benz E-Class", "Orange", 2016))
    );

    @Override
    public List<Car> getCarsByCount(int numberOfCars) {
        return numberOfCars < 5 ? carList.stream().limit(numberOfCars).toList() : carList;
    }
}
