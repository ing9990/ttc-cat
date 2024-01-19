package ttccat.exchanges.lbank;

import ttccat.ports.Ticker;

public class LBankTicker extends Ticker {

    public LBankTicker(String high, String vol, String low, String change, String latest) {
        super(high, vol, low, change, latest);
    }
}
