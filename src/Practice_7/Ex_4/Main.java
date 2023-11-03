package Practice_7.Ex_4;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("4");

        // тестирование методов
        MathFunc mathFunc = new MathFunc();

        System.out.println(mathFunc.pow(2, 10));
        System.out.println(mathFunc.complexModule(4, 3));
        System.out.println(mathFunc.circleLen(22));
        System.out.println(mathFunc.circleSquare(45));
    }
}
