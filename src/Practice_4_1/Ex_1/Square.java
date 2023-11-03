package Practice_4_1.Ex_1;

public class Square extends Shape {

    // сторона
    public double side;

    // конструктор
    public Square(double side) {
        this.side = side;
    }

    // получение типа
    @Override
    String getType() {
        return "Square";
    }

    // площадь
    @Override
    double getArea() {
        return side * side;
    }

    // периметр
    @Override
    double getPerimeter() {
        return 4 * side;
    }

    // в строку
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
