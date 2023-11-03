package Practice_4_1.Ex_1;

public class Circle extends Shape {

    // радиус
    public double radius;

    // конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // получение типа
    @Override
    String getType() {
        return "Circle";
    }

    // площадь
    @Override
    double getArea() {
        return radius * Math.PI * Math.PI;
    }

    // периметр
    @Override
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // в строку
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
