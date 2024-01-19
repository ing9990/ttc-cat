package ttccat.exchanges.mexc;

import static org.junit.jupiter.api.Assertions.*;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.junit.jupiter.api.Test;
import ttccat.ports.ExchangeResponse;

class MexcPortTest {

    @Test
    void getPrice() {
        ExchangeResponse response = Feign.builder()
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .target(MexcPort.class, "https://api.mexc.com")
            .getPrice();

        System.out.println(response.getTicker());
    }
}