package ttccat.exchanges.lbank;

import feign.Feign;
import feign.gson.GsonDecoder;
import org.junit.jupiter.api.Test;
import ttccat.ports.ExchangeResponse;

class LBankResponseTest {

    @Test
    void getData() {
        ExchangeResponse response = Feign.builder()
            .decoder(new GsonDecoder())
            .target(LBankPort.class,"https://api.lbkex.com")
            .getPrice();

        System.out.println(response.getTicker());
    }

}