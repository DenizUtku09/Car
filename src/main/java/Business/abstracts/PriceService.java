package Business.abstracts;

import entities.Price;

public interface PriceService {


    Price addPriceToCar(int id,Price price);
    void deletePriceInCar(int id);
    Price updatePriceInCar(int id,Price price);


}
