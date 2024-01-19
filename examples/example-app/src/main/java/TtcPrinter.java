
import ttccat.ExchangeType;
import ttccat.TtcCat;
import ttccat.TtcCatImpl;

public class TtcPrinter {
    private static TtcCat LBANK = new TtcCatImpl(ExchangeType.LBANK);
    private static TtcCat MEXC = new TtcCatImpl(ExchangeType.MEXC);

    public static void main(String[] args) {
        // 0.7948
        String lbankTtcPrice = LBANK.get().getTicker().getLatest();

        // 0.7955
        String mexcTtcPrice = MEXC.get().getTicker().getLatest();
    }
}
