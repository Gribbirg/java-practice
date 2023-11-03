package Practice_3.Ex_2_1;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 2.1\n");

        ex1();
        Messages.waitMessage();

        ex2();
        Messages.waitMessage();

        ex3();
        Messages.waitMessage();

        ex4();
        Messages.waitMessage();

        ex5();
        Messages.waitMessage();
    }

    // получение числа из строки
    private static void ex1(){
        System.out.println("Задание 1");
        String before = "9.888";
        Double ans;
        ans = Double.valueOf(before);
        System.out.println("Результат: " + ans);
    }

    // получение строки из числа
    private static void ex2() {
        System.out.println("Задание 2");
        String before = "555.8234432";
        Double ans;
        ans = Double.parseDouble(before);
        System.out.println("Результат: " + ans);
    }

    // получение примитивных типов данных из числа
    private static void ex3() {

        System.out.println("Задание 3");

        Double aDouble = 8.32223123;
        System.out.println("Число: " + aDouble);

        int a = aDouble.intValue();
        System.out.println("Целое: " + a);

        float b = aDouble.floatValue();
        System.out.println("Вещественное: " + b);

        byte c = aDouble.byteValue();
        System.out.println("Байт: " + c);

        char d = aDouble.toString().charAt(0);
        System.out.println("Символ: " + d);

        boolean e = aDouble.isInfinite();
        System.out.println("Булевское: " + e);
    }

    // вывод числа
    private static void ex4() {
        System.out.println("Задание 4\n");
        Double num = 5789.234968;
        System.out.println("Число:");
        System.out.println(num);
    }

    // получение строки из числа
    private static void ex5() {
        System.out.println("Задание 5\n");
        double num = 37128.455594846;
        String str = Double.toString(num);
        System.out.println("Число как строка:");
        System.out.println(str);
    }
}
