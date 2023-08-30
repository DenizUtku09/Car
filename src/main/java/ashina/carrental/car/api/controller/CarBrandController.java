package ashina.carrental.car.api.controller;



import ashina.carrental.car.business.abstracts.CarBrandService;
import ashina.carrental.car.entities.Car;
import ashina.carrental.car.entities.CarBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(name = "/api/carBrand")
public class CarBrandController {

    private final CarBrandService carBrandService;
    @Autowired
    public CarBrandController(CarBrandService carBrandService){
        super();
        this.carBrandService=carBrandService;
    }

    @PostMapping("/addCarBrand")
    public @ResponseBody ResponseEntity<CarBrand> addCarBrand(@RequestParam String brandName){
        CarBrand addedCarBrand=carBrandService.addCarBrand(brandName);
        return ResponseEntity.ok(addedCarBrand);}

    @PutMapping("/updateCarBrandByName/{brandName}")
    public @ResponseBody ResponseEntity<CarBrand> updateCarBrandByName(@PathVariable String brandName,@RequestParam(name = "updatedCarBrand") String brandName2){
        CarBrand updatedCarBrand=carBrandService.updateCarBrandByName(brandName,brandName2);
        return ResponseEntity.ok(updatedCarBrand);
    }
    @PutMapping("/updateCarBrandById/{id}")
    public @ResponseBody ResponseEntity<CarBrand> updateCarBrandById(@PathVariable int id,@RequestParam String brandName){
        CarBrand updatedCarBrand=carBrandService.updateCarBrandById(id,brandName);
        return ResponseEntity.ok(updatedCarBrand);
    }

    @DeleteMapping("/deleteCarBrandByName")
    public void deleteCarBrandByName(@RequestParam String brandName){carBrandService.deleteCarBrandByName(brandName);}

    @DeleteMapping("/deleteCarBrandById")
    public void deleteCarBrandById(@RequestParam int id){
        carBrandService.deleteCarBrandById(id);
    }
    @GetMapping("/getAllCarBrands")
    public List<CarBrand> getAllCarBrands(){
        return carBrandService.getAllCarBrands();
    }
    @PostMapping("/addCarBrandToCarById/{carId}")
    public Car addCarBrandToCarById(@PathVariable int carId,@RequestParam int brandId){
        return carBrandService.addCarBrandToCarById(carId,brandId);

    }
    @PostMapping("/addCarBrandToCarByName/{carId}")
    public  Car addCarBrandToCarByName(@PathVariable int carId,@RequestParam String brandName){
        return carBrandService.addCarBrandToCarByName(carId,brandName);
    }
}
