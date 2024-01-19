package ttccat.exchanges.lbank;

import ttccat.ports.ExchangeResponse;

import java.util.List;

public class LBankResponse implements ExchangeResponse {

    private String result;
    private List<DataItem> data;
    private int error_code;
    private long ts;

    static class DataItem {

        private String symbol;
        private Ticker ticker;
        private long timestamp;
    }

    static class Ticker {

        private String high;
        private String vol;
        private String low;
        private String change;
        private String latest;

        public String getHigh() {
            return high;
        }

        public String getVol() {
            return vol;
        }

        public String getLow() {
            return low;
        }

        public String getChange() {
            return change;
        }

        public String getLatest() {
            return latest;
        }
    }

    public LBankTicker getTicker() {
        DataItem dataItem = this.data.stream().findFirst().orElseThrow(IllegalArgumentException::new);
        Ticker ticker = dataItem.ticker;

        return new LBankTicker(ticker.getHigh(), ticker.getVol(), ticker.getLow(), ticker.getChange(), ticker.getLatest());
    }
}
