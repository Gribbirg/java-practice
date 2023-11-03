package Practice_3.Ex_3_2;

// класс для самих продуктов
public class Product {

    // название
    private final String name;

    // цена в рублях
    private final double coast;

    // кол-во в магазине
    public int count;

    // конструктор
    public Product(String name, double coast, int count) {
        this.name = name;
        this.coast = coast;
        this.count = count;
    }

    // методы получения свойств
    public String getName() {
        return name;
    }

    public double getCoast() {
        return coast;
    }

    // преобразование в строку
    @Override
    public String toString() {
        return "Название: " + name +
                ", цена: " + coast +
                ", кол-во в наличии: " + count;
    }
}
