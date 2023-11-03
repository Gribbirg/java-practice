package Practice_3.Ex_3_2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public abstract class CurrencyConverter {

    // курс валют
    private static final CurrencyRate[] currencyRates = {new CurrencyRate("Dollar", "Ruble", 98.40),
            new CurrencyRate("Euro", "Ruble", 105.55),
            new CurrencyRate("Dollar", "Euro", 0.93)
    };

    // перевести деньги в другую валюту
    public static Double convert(String startCurrency, double money, String finishCurrency) {

        if (Objects.equals(startCurrency, finishCurrency)) return money;

        for (CurrencyRate currencyRate : currencyRates) {

            if (Objects.equals(startCurrency, currencyRate.startCurrency) & Objects.equals(finishCurrency, currencyRate.finishCurrency))
                return money * currencyRate.rate;
            else if (Objects.equals(startCurrency, currencyRate.finishCurrency) & Objects.equals(finishCurrency, currencyRate.startCurrency))
                return money / currencyRate.rate;

        }

        return null;

    }

    // форматирование денег в соответствии с валютой
    public static String getMoneyString(double money, String currency) {
        NumberFormat numberFormat = null;
        switch (currency) {
            case "Ruble" -> numberFormat = NumberFormat.getCurrencyInstance();
            case "Dollar" -> numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
            case "Euro" -> numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        }
        return numberFormat.format(money);
    }
}
