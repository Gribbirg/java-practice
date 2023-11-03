package Practice_2.Ex_6;

import Practice_2.Ex_1.Author;

import java.util.Scanner;

// тестирование класса
public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Задание 6\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус окружности: ");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("Окружность с радиусом " + circle.getRadius());

        System.out.println("Площадь окружности " + circle.getSquare());
        System.out.println("Длинна окружности " + circle.getLen() + '\n');

        System.out.print("Введите новый радиус окружности: ");
        radius = scanner.nextInt();
        circle.setRadius(radius);
        System.out.println("Окружность с новым радиусом " + circle.getRadius() + '\n');

        System.out.print("Введите радиус второй окружности: ");
        radius = scanner.nextInt();
        Circle secondCircle = new Circle(radius);
        Boolean result = circle.compare(secondCircle);
        if (result == null) System.out.println("Данные окружности одинаковы");
        else if (result) System.out.println("Первая окружность больше");
        else System.out.println("Вторая окружность больше");
    }
}
