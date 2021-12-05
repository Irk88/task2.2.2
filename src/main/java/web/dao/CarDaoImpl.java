package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("BMW", "Blue", "2"));
        allCars.add(new Car("Niva", "Brown", "5"));
        allCars.add(new Car("Hyundai", "Silver", "4"));
        allCars.add(new Car("Audi", "White", "4"));
        allCars.add(new Car("Kia", "Gray", "4"));
        return allCars;
    }
}
