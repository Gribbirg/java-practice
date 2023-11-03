package Practice_4.Ex_3.Catalog;

import ForAll.Messages;

// класс для товаров
public class Product {
    public final String name;
    public final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + Messages.getPriceRubles(price);
    }
}
