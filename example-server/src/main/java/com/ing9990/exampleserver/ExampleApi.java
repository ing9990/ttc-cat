package com.ing9990.exampleserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ttccat.ExchangeType;
import ttccat.TtcCat;
import ttccat.TtcCatImpl;

@Configuration
class TtcConfig {
    @Bean
    public TtcCat ttcCat() {
        return new TtcCatImpl(ExchangeType.LBANK);
        // return new TtcCatImpl(ExchangeType.MEXC);
    }
}

@RestController
@RequestMapping("/api/v1")
public class ExampleApi {

    private final TtcCat ttcCat;

    public ExampleApi(TtcCat ttcCat) {
        this.ttcCat = ttcCat;
    }

    @GetMapping("/price")
    String price() {
        // 0.07396 [USDT]
        return ttcCat.get().getTicker().getLatest();
    }
}
