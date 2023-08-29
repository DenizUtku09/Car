package ashina.carrental.car.business.abstracts;


import ashina.carrental.car.Requests.AddCarBrandRequest;
import ashina.carrental.car.entities.CarBrand;

import java.util.List;

public interface CarBrandService {

    CarBrand addCarBrand(AddCarBrandRequest addCarBrandRequest);
    void deleteCarBrandByName(String brandName);
    void deleteCarBrandById(int id);

    List<CarBrand> getAllCarBrands();

}
