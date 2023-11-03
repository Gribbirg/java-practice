package Practice_4_1.Ex_1;

public class Rectangle extends Shape {

    // стороны
    public double a;
    public double b;

    // конструктор
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // получение типа
    @Override
    String getType() {
        return "Rectangle";
    }

    // площадь
    @Override
    double getArea() {
        return a * b;
    }

    // периметр
    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }

    // в строку
    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
