package Practice_3.Ex_1_2;

public class Point {

    // координаты
    public double x;
    public double y;

    // конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // преобразование в строку
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
