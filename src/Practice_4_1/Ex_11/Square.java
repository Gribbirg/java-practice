package Practice_4_1.Ex_11;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return width; }

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
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                '}';
    }
}
