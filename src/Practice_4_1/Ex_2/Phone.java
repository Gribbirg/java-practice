package Practice_4_1.Ex_2;

public class Phone {
    private String number;
    private String model;
    private int weight;

    // конструкторы
    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    // получение вызова
    public void receiveCall(String name) {
        System.out.println("Звонит {" + name +"}");
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит {" + name +"} с номера {" + number + "}");
    }

    // телефон
    public String getNumber() {
        return number;
    }

    // отправка сообщения
    public void sendMessage(String ... numbers) {
        System.out.println("Сообщение для:");
        for (String number : numbers) System.out.println(number);
    }
}
