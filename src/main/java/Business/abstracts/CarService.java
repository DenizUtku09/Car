package Business.abstracts;

import entities.Car;

import java.util.List;

public interface CarService {
    public List<Car> findCarsWithSorting(String field);
}
