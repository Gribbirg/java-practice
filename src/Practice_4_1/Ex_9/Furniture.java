package Practice_4_1.Ex_9;

// родительский класс для мебели
public abstract class Furniture {
    protected final double price;

    public Furniture(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                '}';
    }
}
