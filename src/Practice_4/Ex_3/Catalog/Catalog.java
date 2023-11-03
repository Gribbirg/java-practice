package Practice_4.Ex_3.Catalog;

// каталог
public enum Catalog {
    // категории
    OILS_AND_AUTO_CHEMICALS("Масла и автохимия") {
        @Override
        public Product[] getProducts() {
            Product[] products = new Product[OilsAndAutoChemicals.values().length];
            for (int i = 0; i < OilsAndAutoChemicals.values().length; i++) {
                products[i] = OilsAndAutoChemicals.values()[i].product;
            }
            return products;
        }
    },
    TIRES_AND_WHEELS("Шины и диски") {
        @Override
        public Product[] getProducts() {
            Product[] products = new Product[TiresAndWheels.values().length];
            for (int i = 0; i < TiresAndWheels.values().length; i++) {
                products[i] = TiresAndWheels.values()[i].product;
            }
            return products;
        }
    },
    AUTOELECTRONICS("Автоэлектроника") {
        @Override
        public Product[] getProducts() {
            Product[] products = new Product[Autoelectronics.values().length];
            for (int i = 0; i < Autoelectronics.values().length; i++) {
                products[i] = Autoelectronics.values()[i].product;
            }
            return products;
        }
    };

    // название категории
    public final String name;

    Catalog(String name) {
        this.name = name;
    }

    // получение списка продуктов у категории
    public Product[] getProducts() {
        return null;
    }
}
