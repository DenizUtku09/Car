package Business.concretes;

import Business.abstracts.CarService;
import DataAccess.CarDao;

import entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {

    public CarDao carDao;
    @Autowired
    public CarManager(CarDao carDao){
        super();
        this.carDao=carDao;
    }

    @Override
    public List<Car> findCarsWithSorting(String field) {
        return null;
    }
}
