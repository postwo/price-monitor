package com.example.price_monitor.model.price;

import com.example.price_monitor.model.coinbase.SpotPriceResponse;

public record PriceResponse(Double amount, String base, String currency) {
    public static PriceResponse from(SpotPriceResponse spotPriceResponse) {
        var amount = Double.parseDouble(spotPriceResponse.data().amount());
        var base = spotPriceResponse.data().base();
        var currency = spotPriceResponse.data().currency();

        return new PriceResponse(amount, base, currency);
    }

    // 불필요한 data 레이어를 제거 해서 사용
    //여기서는 본래 api하고 다르게 data를 벗기고 그안쪽에 있는 데이터만 사용할거다
    //ex)
    //    {
        //    "amount": "83823.155",
        //    "base": "BTC",
        //    "currency": "USD"
    //    }
}
