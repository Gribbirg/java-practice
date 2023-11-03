package Practice_4_1.Ex_1;

import ForAll.Messages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("1");

        Scanner scanner = new Scanner(System.in);
        double enter;

        // ввод информации
        System.out.print("Радиус круга: ");
        Circle circle = new Circle(scanner.nextDouble());
        printShapeInfo(circle); // вывод информации о фигуре

        System.out.print("Сторона прямоугольника: ");
        enter = scanner.nextDouble();
        System.out.print("Вторая сторона: ");
        Rectangle rectangle = new Rectangle(enter, scanner.nextDouble());
        printShapeInfo(rectangle); // вывод информации о фигуре

        System.out.print("Сторона квадрата: ");
        Square square = new Square(scanner.nextDouble());
        printShapeInfo(square); // вывод информации о фигуре
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Наименование: " + shape.getType());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println(shape);
        System.out.println();
    }
}
