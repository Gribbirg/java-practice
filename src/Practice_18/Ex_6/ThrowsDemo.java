package Practice_18.Ex_6;

import ForAll.Messages;

public class ThrowsDemo {
    public void printMessage1(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public void printMessage2(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("key is not good because " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for" + key;
    }

    public static void main(String[] args) {
        Messages.printExNum("6");

        ThrowsDemo throwsDemo = new ThrowsDemo();

        throwsDemo.printMessage1("VYU");
//        Exception in thread "main" java.lang.NullPointerException: null key in getDetails
//        throwsDemo.printMessage1(null);
        System.out.println();

        throwsDemo.printMessage2(null);

    }
}
