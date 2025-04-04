package com.example.price_monitor.model.coinbase;

public record SpotPriceResponse(SpotPriceData data) {} // 이게 전체틀인 data를 의미한다

//response 형태
// {
//    "data": { //PriceResponse
//    "amount": "83823.155",
//    "base": "BTC",
//    "currency": "USD"
//    }
// }