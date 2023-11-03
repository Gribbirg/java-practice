package Practice_4_1.Ex_10;

public class Ship extends Vehicle {
    // создание через конструктор родителя с нужными параметрами
    public Ship() {
        super(7.5, 50);
    }

    @Override
    public String toString() {
        return "Корабль: " + super.toString();
    }
}
