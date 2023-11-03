package Practice_2.Ex_6;

public class Circle {

    // радиус
    private int radius;

    // конструктор
    public Circle(int radius) {
        this.radius = radius;
    }

    // методы изменения и получения свойств
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // подсчёт площади
    public double getSquare() {
        return 3.14 * radius * radius;
    }

    // подсчёт длинны
    public double getLen() {
        return 2 * 3.14 * radius;
    }

    // сравнивание двух окружностей
    public Boolean compare(Circle circle) {
        if (radius != circle.radius)
            return radius > circle.getRadius();
        else
            return null;
    }
}
