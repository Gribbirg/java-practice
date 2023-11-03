package Practice_2.Ex_2;

import java.util.Scanner;

// тестирование методов класса
public class TestBall {
    public static void main(String[] args) {

        System.out.println("Задание 2\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите информацию о мяче: ");

        System.out.print("Введите значение координаты x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение координаты y: ");
        double y = scanner.nextDouble();

        Ball ball1 = new Ball(x, y);
        Ball ball2 = new Ball();

        System.out.println("\nПервый мяч:\n" +
                "x: " + ball1.getX() + '\n' +
                "y: " + ball1.getY() + '\n');

        System.out.println("\nВторой мяч:\n" +
                "x: " + ball2.getX() + '\n' +
                "y: " + ball2.getY() + '\n');

        System.out.print("Введите новую координату x: ");
        x = scanner.nextDouble();
        ball1.setX(x);
        System.out.println("Новая координата x: " + ball1.getX() + '\n');

        System.out.print("Введите новую координату y: ");
        y = scanner.nextDouble();
        ball1.setY(y);
        System.out.println("Новая координата x: " + ball1.getY() + '\n');

        System.out.print("Введите новую координату x: ");
        x = scanner.nextDouble();
        System.out.print("Введите новую координату y: ");
        y = scanner.nextDouble();
        ball1.setXY(x, y);
        System.out.println("Новые координаты:\n" +
                "x: " + ball1.getY() + '\n' +
                "y: " + ball1.getX() + '\n');

        System.out.print("Введите изменение координаты x: ");
        x = scanner.nextDouble();
        System.out.print("Введите изменение координаты y: ");
        y = scanner.nextDouble();
        ball1.move(x, y);
        System.out.println("Новые координаты:\n" +
                "x: " + ball1.getY() + '\n' +
                "y: " + ball1.getX() + '\n');

        System.out.println('\n' + ball1.toString());
    }
}
