package Practice_2.Ex_2;

public class Ball {

    private double x = 0.0;

    private double y = 0.0;

    // конструктор с аргументами
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // конструктор без аргументов
    public Ball() {
    }

    // методы изменения и получения свойств
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // движение - изменение всех координат
    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    // преобразование в строку
    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
