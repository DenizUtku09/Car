package ashina.carrental.car.business.abstracts;

import ashina.carrental.car.entities.Price;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface PriceService {


    Price addPriceToCar(int id,Price price);
    void deletePriceInCar(int id);
    Price updatePriceInCar(int id,Price price);


}
