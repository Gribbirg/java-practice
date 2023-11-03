package Practice_3.Ex_3_1;

// курс
public class CurrencyRate {

    // стартовая валюта
    public String startCurrency;

    // конечная валюта
    public String finishCurrency;

    // курс
    public double rate;

    // конструктор
    public CurrencyRate(String startCurrency, String finishCurrency, double rate) {
        this.startCurrency = startCurrency;
        this.finishCurrency = finishCurrency;
        this.rate = rate;
    }
}
