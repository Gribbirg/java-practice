package Practice_4.Ex_3.Catalog;

// перечисление электроники
public enum Autoelectronics {
    LAMP(new Product("Лампа", 200)),
    BATTERY(new Product("Аккумулятор", 8000)),
    CIRCUIT_BREAKER(new Product("Предохранитель", 100));
    public final Product product;

    Autoelectronics(Product product) {
        this.product = product;
    }
}
