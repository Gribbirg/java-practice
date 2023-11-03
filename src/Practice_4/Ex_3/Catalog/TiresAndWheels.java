package Practice_4.Ex_3.Catalog;

// перечисление шин и дисков
public enum TiresAndWheels {
    SUMMER_TIRE(new Product("Летняя шина", 4000)),
    WINTER_TIRE(new Product("Зимняя шина", 6000)),
    DISK(new Product("Диск", 2000));

    public final Product product;

    TiresAndWheels(Product product) {
        this.product = product;
    }
}
