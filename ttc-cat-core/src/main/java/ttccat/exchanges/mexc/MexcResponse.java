package ttccat.exchanges.mexc;

import ttccat.ports.Ticker;
import ttccat.ports.ExchangeResponse;

public class MexcResponse implements ExchangeResponse {

    private String symbol;
    private String priceChange;
    private String priceChangePercent;
    private String prevClosePrice;
    private String lastPrice;
    private String bidPrice;
    private String bidQty;
    private String askPrice;
    private String askQty;
    private String openPrice;
    private String highPrice;
    private String lowPrice;
    private String volume;
    private String quoteVolume;
    private long openTime;
    private long closeTime;
    private Integer count;


    @Override
    public Ticker getTicker() {
        return new MexcTicker(highPrice, volume, lowPrice, priceChange, lastPrice);
    }

    @Override
    public String toString() {
        return "MexcResponse{" + "symbol='" + symbol + '\'' + ", priceChange='" + priceChange + '\'' + ", priceChangePercent='" + priceChangePercent + '\'' + ", prevClosePrice='" + prevClosePrice
            + '\'' + ", lastPrice='" + lastPrice + '\'' + ", bidPrice='" + bidPrice + '\'' + ", bidQty='" + bidQty + '\'' + ", askPrice='" + askPrice + '\'' + ", askQty='" + askQty + '\''
            + ", openPrice='" + openPrice + '\'' + ", highPrice='" + highPrice + '\'' + ", lowPrice='" + lowPrice + '\'' + ", volume='" + volume + '\'' + ", quoteVolume='" + quoteVolume + '\''
            + ", openTime=" + openTime + ", closeTime=" + closeTime + ", count=" + count + '}';
    }
}
