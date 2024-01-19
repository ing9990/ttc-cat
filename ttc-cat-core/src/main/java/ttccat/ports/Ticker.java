package ttccat.ports;

public abstract class Ticker {

    private String high;
    private String vol;
    private String low;
    private String change;
    private String latest;

    public Ticker(String high, String vol, String low, String change, String latest) {
        this.high = high;
        this.vol = vol;
        this.low = low;
        this.change = change;
        this.latest = latest;
    }

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

    @Override
    public String toString() {
        return "Ticker{" + "high='" + high + '\'' + ", vol='" + vol + '\'' + ", low='" + low + '\'' + ", change='" + change + '\'' + ", latest='" + latest + '\'' + '}';
    }
}