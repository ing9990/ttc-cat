# Springboot
```java

@Configuration
class TtcConfig {
    @Bean
    public TtcCat ttcCat() {
        return new TtcCatImpl(ExchangeType.LBANK);
        // return new TtcCatImpl(ExchangeType.MEXC);
    }
}

@RestController
@RequestMapping("/api/v1")
public class ExampleApi {

    private final TtcCat ttcCat;

    public ExampleApi(TtcCat ttcCat) {
        this.ttcCat = ttcCat;
    }

    @GetMapping("/price")
    String price() {
        // 0.07396 [USDT]
        return ttcCat.get().getTicker().getLatest();
    }
}

```

# Java

```java
public class TtcPrinter {
    private static TtcCat MEXC = new TtcCatImpl(ExchangeType.MEXC);

    public static void main(String[] args) {
        
        // 0.7955
        String mexcTtcPrice = MEXC.get().getTicker().getLatest();
    }
}

```