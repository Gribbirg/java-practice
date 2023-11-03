package Practice_4_1.Ex_3;

public class Person {
    public String fullName;
    public int age;

    // конструкторы
    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // ходить
    public void move() {
        System.out.println(fullName + " Person передвигается");
    }

    // говорить
    public void talk() {
        System.out.println(fullName + " Person говорит");
    }
}
