package ttccat.exchanges.mexc;

import feign.RequestLine;
import ttccat.ports.ExchangePort;

public interface MexcPort extends ExchangePort {

    String TTC_USDT_SYMBOL = "?symbol=TTCUSDT";

    @RequestLine("GET /api/v3/ticker/24hr" + TTC_USDT_SYMBOL)
    MexcResponse getPrice();
}
