package Business.abstracts;


import Requests.AddCarBrandRequest;
import entities.CarBrand;

import java.util.List;

public interface CarBrandService {

    CarBrand addCarBrand(AddCarBrandRequest addCarBrandRequest);
    void deleteCarBrandByName(String brandName);
    void deleteCarBrandById(int id);

    List<CarBrand> getAllCarBrands();
    Sort
}
