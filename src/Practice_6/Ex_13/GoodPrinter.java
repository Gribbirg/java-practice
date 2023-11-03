package Practice_6.Ex_13;

// пример наблюдателя
public class GoodPrinter implements Observer {

    public GoodPrinter(MyStringBuilder myStringBuilder) {
        myStringBuilder.registerObserver(this);
    }

    @Override
    public void update(String str) {
        System.out.println("New str: " + str);
    }
}
