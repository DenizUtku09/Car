package ashina.carrental.car.business.abstracts;


import ashina.carrental.car.Requests.AddCarBrandRequest;
import ashina.carrental.car.entities.Car;
import ashina.carrental.car.entities.CarBrand;

import java.util.List;
import java.util.stream.Stream;

public interface CarBrandService {

    CarBrand addCarBrand(String brandName);
    CarBrand updateCarBrandByName(String brandName,String brandName2);
    CarBrand updateCarBrandById(int id,String brandName);
    void deleteCarBrandByName(String brandName);
    void deleteCarBrandById(int id);
    List<CarBrand> getAllCarBrands();
    Car addCarBrandToCarById(int carId,int brandId);
    Car addCarBrandToCarByName(int carId,String brandName);

    Car updateCarBrandInCar(int carId,String brandName);


}
