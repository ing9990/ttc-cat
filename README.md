# Springboot Example

```java
@RestController
public class ExampleApi {
    
    @Autowired
    private TtcCat ttcCat;

    @GetMapping
    String price() {
        return ttcCat.get().getTicker().getLatest();  // 0.07396 [USDT]
    }
}

```

# Java Example

```java
public class TtcPrinter {
    private static TtcCat MEXC = new TtcCatImpl(ExchangeType.MEXC);

    public static void main(String[] args) {
        String mexcTtcPrice = MEXC.get().getTicker().getLatest(); // 0.7955
    }
}

```