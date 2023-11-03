package Practice_4.Ex_3.Catalog;

// перечисление жидкостей
public enum OilsAndAutoChemicals {
    MOTOR_OIL(new Product("Моторное масло", 4500)),
    TRANSMISSION_OIL(new Product("Масло трансмиссионное", 4000)),
    WINDSHIELD_WASHER_FLUID(new Product("Жидкость для омывателя стекла", 200));

    public final Product product;

    OilsAndAutoChemicals(Product product) {
        this.product = product;
    }
}
