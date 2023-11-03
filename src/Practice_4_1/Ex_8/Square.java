package Practice_4_1.Ex_8;

public class Square extends Rectangle {

    public Square() {
    }

    // создание через прямогульник
    public Square(double side) {
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return width; }

    // задача через прямоугольник
    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    String getType() {
        return "Square";
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                '}';
    }
}
