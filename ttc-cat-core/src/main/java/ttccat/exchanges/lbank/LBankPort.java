package ttccat.exchanges.lbank;

import feign.RequestLine;
import ttccat.ports.ExchangePort;

public interface LBankPort extends ExchangePort {

    String DEFAULT_TTC_USDT_SYMBOL = "?symbol=ttc_usdt";
    String REUQEST_URL = "/v2/ticker/24hr.do";

    @RequestLine("GET " + REUQEST_URL + DEFAULT_TTC_USDT_SYMBOL)
    LBankResponse getPrice();
}
