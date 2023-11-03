package Practice_2.Ex_5;

public class Dog {

    // имя
    private String name;

    // возраст
    private int age;

    // контруктор
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // методы изменения и получения свойств
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // получение возраста в человеческом варианте
    public int getAgeLikePeople() {
        return age * 7;
    }

    // преобразование в строку
    @Override
    public String toString() {
        return "Собака: " +
                "кличка = '" + name + '\'' +
                ", возраст = " + age +
                ", \"человеческий\" возраст = " + getAgeLikePeople() +
                '.';
    }
}
