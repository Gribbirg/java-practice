package Practice_4_1.Ex_8;

import ForAll.Messages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("8");

        Scanner scanner = new Scanner(System.in);
        double enter;

        System.out.print("Радиус круга: ");
        Circle circle = new Circle(scanner.nextDouble());
        printShapeInfo(circle);

        System.out.print("Сторона прямоугольника: ");
        enter = scanner.nextDouble();
        System.out.print("Вторая сторона: ");
        Rectangle rectangle = new Rectangle(enter, scanner.nextDouble());
        printShapeInfo(rectangle);

        System.out.print("Сторона квадрата: ");
        Square square = new Square(scanner.nextDouble());
        printShapeInfo(square);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Наименование: " + shape.getType());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println(shape);
        System.out.println();
    }
}
