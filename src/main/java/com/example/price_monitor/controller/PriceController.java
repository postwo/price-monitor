package com.example.price_monitor.controller;

import com.example.price_monitor.model.price.PriceResponse;
import com.example.price_monitor.service.CoinBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/prices")
public class PriceController {

    @Autowired
    private CoinBaseService coinbaseService;

    @GetMapping("/{currencyPair}/market-price")
    public ResponseEntity<PriceResponse> getMarketPrice(@PathVariable String currencyPair) {
        var spotPriceResponse = coinbaseService.getSpotPriceByCurrencyPair(currencyPair);
        var priceResponse = PriceResponse.from(spotPriceResponse);
        return ResponseEntity.ok(priceResponse);
    }
}
