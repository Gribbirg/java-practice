package Practice_4_1.Ex_10;

public class Train extends Vehicle {
    // создание через конструктор родителя с нужными параметрами
    public Train() {
        super(1, 1.6);
    }

    @Override
    public String toString() {
        return "Поезд: " + super.toString();
    }
}
