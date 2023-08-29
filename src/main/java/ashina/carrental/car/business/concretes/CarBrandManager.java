package ashina.carrental.car.business.concretes;

import ashina.carrental.car.DataAccess.CarBrandDao;
import ashina.carrental.car.Requests.AddCarBrandRequest;
import ashina.carrental.car.business.abstracts.CarBrandService;
import ashina.carrental.car.entities.CarBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarBrandManager implements CarBrandService {
    private final CarBrandDao carBrandDao;
    @Autowired
    public CarBrandManager(CarBrandDao carBrandDao){
        super();
        this.carBrandDao=carBrandDao;
    }

    @Override
    public CarBrand addCarBrand(AddCarBrandRequest addCarBrandRequest) {
        Optional<CarBrand> existingCarBrand=carBrandDao.findCarBrandByBrandName(addCarBrandRequest.brandName());
        if(existingCarBrand.isPresent()){throw new RuntimeException("This car brand already exists by name.");}
        else{
            CarBrand addedCarBrand=new CarBrand();
            addedCarBrand.setBrandName(addCarBrandRequest.brandName());
            return addedCarBrand;}
    }

    @Override
    public void deleteCarBrandByName(String brandName) {
        Optional<CarBrand> existingCarBrand=carBrandDao.findCarBrandByBrandName(brandName);

        existingCarBrand.ifPresentOrElse(carBrandDao::delete,() -> {throw new RuntimeException("T");});

    }

    @Override
    public void deleteCarBrandById(int id) {
        Optional<CarBrand> existingCarBrand=carBrandDao.findCarBrandById(id);

        existingCarBrand.ifPresentOrElse(carBrandDao::delete,() -> {throw new RuntimeException("T");});

    }

    @Override
    public List<CarBrand> getAllCarBrands() {
        return carBrandDao.findAll();
    }
}
