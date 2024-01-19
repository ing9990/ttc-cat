package ttccat.exchanges.mexc;

import ttccat.ports.Ticker;

public class MexcTicker extends Ticker {

    public MexcTicker(String high, String vol, String low, String change, String latest) {
        super(high, vol, low, change, latest);
    }
}
