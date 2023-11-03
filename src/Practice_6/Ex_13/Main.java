package Practice_6.Ex_13;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("13");

        // тестирование методов
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        new Printer(myStringBuilder);
        new GoodPrinter(myStringBuilder);

        myStringBuilder.append("asdsadas");
        myStringBuilder.delete(2, 5);
        myStringBuilder.append("ggg");

    }
}
