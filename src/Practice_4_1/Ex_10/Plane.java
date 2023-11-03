package Practice_4_1.Ex_10;

public class Plane extends Vehicle {
    // создание через конструктор родителя с нужными параметрами
    public Plane() {
        super(0.06, 2);
    }

    @Override
    public String toString() {
        return "Самолёт: " + super.toString();
    }
}
