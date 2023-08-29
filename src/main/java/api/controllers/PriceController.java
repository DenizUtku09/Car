package api.controllers;

import Business.abstracts.PriceService;
import entities.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/price-controller")
public class PriceController {
    private final PriceService priceService;
    @Autowired
    public PriceController(PriceService priceService){
        super();
        this.priceService=priceService;
    }
    public ResponseEntity<Price> addPriceToCar(@PathVariable int id, @RequestParam Price price){
        Price addedPrice=priceService.addPriceToCar(id,price);
        return ResponseEntity.ok(addedPrice);
    }
}
