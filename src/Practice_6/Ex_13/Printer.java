package Practice_6.Ex_13;

// пример наблюдателя
public class Printer implements Observer {

    public Printer(MyStringBuilder myStringBuilder) {
        myStringBuilder.registerObserver(this);
    }

    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
