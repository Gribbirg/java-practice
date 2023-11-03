package Practice_4_1.Ex_11;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    String getType() {
        return "";
    }

    double getArea() {
        return 0.0;
    }

    double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
