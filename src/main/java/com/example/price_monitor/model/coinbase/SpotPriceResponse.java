package com.example.price_monitor.model.coinbase;

public record SpotPriceResponse(SpotPriceData data) {} // 이게 전체틀인 data를 의미한다

//response 형태
// 중괄호마다 record를 따로 작성한다 그이유는
//1.하나의 객체(Record)가 너무 많은 정보를 담고 있으면 관리가 어렵고 가독성이 떨어질 수 있습니다.
//2.중첩된 구조를 별도의 레코드로 정의하면 각각의 역할과 책임이 분리되어 코드가 더 명확해집니다.
// {
//    "data": { //PriceResponse
//    "amount": "83823.155",
//    "base": "BTC",
//    "currency": "USD"
//    }
// }