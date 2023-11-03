package Practice_6.Ex_12;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("12");

        // тестирование методов и отката
        MyStringBuilder myStringBuilder = new MyStringBuilder();

        myStringBuilder.append("aaaa");
        System.out.println(myStringBuilder);

        myStringBuilder.append("bbbb");
        System.out.println(myStringBuilder);

        myStringBuilder.undo();
        System.out.println(myStringBuilder);

        myStringBuilder.delete(1, 2);
        System.out.println(myStringBuilder);

        myStringBuilder.append("werhuno");
        System.out.println(myStringBuilder);

        myStringBuilder.append("gggg");
        System.out.println(myStringBuilder);

        myStringBuilder.undo();
        myStringBuilder.undo();
        myStringBuilder.undo();
        System.out.println(myStringBuilder);

    }
}
