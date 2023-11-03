package Practice_6.Ex_4;

// тестовый класс
public class Mouse implements Priceable {
    private double price;

    public Mouse(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
