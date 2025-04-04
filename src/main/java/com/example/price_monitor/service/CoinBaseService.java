package com.example.price_monitor.service;

import com.example.price_monitor.model.coinbase.SpotPriceResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class CoinBaseService {

    // 외부 api를 호출하기 워한 RestClient를 구현
    private static final RestClient restClient = RestClient.create();

    /**
     * Refer: <a href="https://docs.cloud.coinbase.com/sign-in-with-coinbase/docs/api-prices#get-spot-price">COINBASE:GET-SPOT-PRICE</a>
     */
    public SpotPriceResponse getSpotPriceByCurrencyPair(String currencyPair) {
       return restClient
                .get()
                // HTTP GET 요청을 생성함

                .uri("https://api.coinbase.com/v2/prices/{currencyPair}/spot",currencyPair)
                // 요청 URI를 설정하며, {currencyPair} 자리에 실제 쌍(currencyPair)이 대입됨

                .retrieve()
                // API 응답을 받아서 처리할 준비를 함

                .body(SpotPriceResponse.class);
                // 응답 본문(body)을 문자열(String) 형식으로 변환하여 반환
    }
}
