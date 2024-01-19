package ttccat;


import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import ttccat.exchanges.lbank.LBankPort;
import ttccat.exchanges.mexc.MexcPort;
import ttccat.ports.ExchangeResponse;

public class TtcCatImpl implements TtcCat {

    private final ExchangeType type;

    public TtcCatImpl(ExchangeType type) {
        this.type = type;
    }

    @Override
    public ExchangeResponse get() {
        switch (type) {
            case LBANK -> {
                return  Feign.builder()
                    .decoder(new GsonDecoder())
                    .target(LBankPort.class,"https://api.lbkex.com")
                    .getPrice();
            }
            case MEXC -> {
                return Feign.builder()
                    .encoder(new GsonEncoder())
                    .decoder(new GsonDecoder())
                    .target(MexcPort.class, "https://api.mexc.com")
                    .getPrice();
            }
        }
        throw new IllegalStateException();
    }
}
