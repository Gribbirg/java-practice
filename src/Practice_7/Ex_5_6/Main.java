package Practice_7.Ex_5_6;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("5 и 6");

        // тестирование методов
        ProcessStrings processStrings = new ProcessStrings("qwertyuiop");

        System.out.println(processStrings.size());
        System.out.println(processStrings.onOddPositions());
        System.out.println(processStrings.reverse());

    }
}
