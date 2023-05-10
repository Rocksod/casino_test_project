package data;

import java.util.Random;

public enum Currency {
    EUR,
    USD,
    GBP,
    AUD,
    CAD,
    JPY;

    public static Currency getRandomCurrency() {
        Currency[] currencies = Currency.values();
        return currencies[new Random().nextInt(currencies.length)];
    }

    @Override
    public String toString() {
        return this.name();
    }
}
