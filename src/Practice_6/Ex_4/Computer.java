package Practice_6.Ex_4;

// тестовый класс
public class Computer implements Priceable {
    private double price;

    public Computer(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
