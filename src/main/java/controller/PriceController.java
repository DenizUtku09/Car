package controller;

import Business.abstracts.PriceService;
import entities.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/api/Price")
public class PriceController {
    private final PriceService priceService;
    @Autowired
    public PriceController(PriceService priceService){
        super();
        this.priceService=priceService;
    }
    @PostMapping( "/addPriceToCar/{id}")
    public ResponseEntity<Price> addPriceToCar(@PathVariable int id, @RequestParam Price price){
        Price addedPrice=priceService.addPriceToCar(id, price);
        return ResponseEntity.ok(addedPrice);
    }
}
