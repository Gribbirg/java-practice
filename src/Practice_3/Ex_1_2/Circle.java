package Practice_3.Ex_1_2;

public class Circle {

    // точка - центр
    private Point center;

    // радиус
    private double radius;

    // конструктор
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // методы изменения и получения свойств
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // подсчёт площади
    public double getSquare() {
        return 3.14 * radius * radius;
    }

    // преобразование в строку
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
