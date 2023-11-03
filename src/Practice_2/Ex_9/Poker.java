package Practice_2.Ex_9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// раздача карт
public class Poker {
    public static void main(String[] args) {

        System.out.println("Задание 9\n");

        // списки мастей и сощностей карт
        final String[] suits = {"черви", "пики", "крести", "буби"};
        final String[] powers = {"Шестёрка", "Семёрка", "Восьмёрка", "Девятка", "Десятка", "Валет", "Дама", "Король", "Туз"};

        ArrayList<Integer> positions = new ArrayList<>();
        for (int i = 0; i < 36; i++) positions.add(i);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Card[] cards = new Card[36];
        int i;

        // создание случайной колоды
        for (String suit : suits) {
            for (String power : powers) {
                i = random.nextInt(positions.size());
                cards[positions.get(i)] = new Card(suit, power);
                positions.remove(i);
            }
        }

        // получение кол-ва игроков (ограничено кол-вом картв колоде)
        System.out.print("Введите кол-во игроков (< 8): ");
        int count = scanner.nextInt();
        System.out.println();

        // выдача карт по порядку
        for (int j = 1; j <= count; j++) {
            System.out.println("Карты игрока с номером " + j + ":");
            for (int z = (j - 1) * 5; z < j * 5; z++) {
                System.out.println(cards[z].power + " " + cards[z].suit);
            }
            System.out.println();
        }
    }
}
