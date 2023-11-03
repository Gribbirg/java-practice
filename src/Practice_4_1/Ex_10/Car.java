package Practice_4_1.Ex_10;

public class Car extends Vehicle {
    // создание через конструктор родителя с нужными параметрами
    public Car() {
        super(0.83, 21);
    }

    @Override
    public String toString() {
        return "Машина: " + super.toString();
    }
}
