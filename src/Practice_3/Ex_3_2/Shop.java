package Practice_3.Ex_3_2;

import java.util.Objects;

// класс магазина
public class Shop {

    // каталог товаров
    private final Product[] catalog;

    // прибыль
    private double income = 0;

    // конструктор
    public Shop(Product[] catalog) {
        this.catalog = catalog;
    }

    // методы получения свойств
    public Product[] getCatalog() {
        return catalog;
    }

    public double getIncome() {
        return income;
    }

    // покупка товара
    public void buyProduct(String productName, int count) {
        Product product = getProduct(productName);
        product.count -= count;
        income += count * product.getCoast();
    }

    // получить товар по названию
    public Product getProduct(String productName) {
        for (Product product : catalog)
            if (Objects.equals(product.getName(), productName))
                return product;
        return null;
    }
}
