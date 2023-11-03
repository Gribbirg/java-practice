package Practice_2.Ex_1;

import java.util.Scanner;

// тестирование методов класса
public class TestAuthor {
    public static void main(String[] args) {

        System.out.println("Задание 1\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите информацию об авторе: ");

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        System.out.print("Введите букву гендера: ");
        char gender = scanner.nextLine().charAt(0);

        Author author = new Author(name, email, gender);

        System.out.println("\nАвтор:\n" +
                "Имя: " + author.getName() + '\n' +
                "Email: " + author.getEmail() + '\n' +
                "Гендер: " + author.getGender() + '\n');

        System.out.print("Введите новый email: ");
        email = scanner.nextLine();
        author.setEmail(email);
        System.out.println("Новый email: " + author.getEmail());

        System.out.println('\n' + author.toString());
    }
}
