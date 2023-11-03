package Practice_3.Ex_1_2;

import Practice_2.Ex_7.Book;

import java.util.Arrays;

public class Tester {

    // список окружностей
    Circle[] mass;

    // размер списка
    int size;

    // конструктор с генерацией случайных значений
    public Tester() {

        size = (int) (Math.random() * 10) + 1;
        mass = new Circle[size];

        for (int i = 0; i < size; i++)
            mass[i] = new Circle(new Point(Math.random(), Math.random()), Math.random());

    }

    // преобразование в строку
    @Override
    public String toString() {
        return "Tester{" +
                "mass=" + Arrays.toString(mass) +
                ", size=" + size +
                '}';
    }

    // получение наибольшей окружности
    public Circle getBiggestCircle() {
        if (mass.length == 0) return null;
        Circle biggestCircle = mass[0];
        for (Circle circle : mass)
            if (biggestCircle.getSquare() < circle.getSquare()) biggestCircle = circle;
        return biggestCircle;
    }

    // получение наименьшей окружности
    public Circle getSmallestCircle() {
        if (mass.length == 0) return null;
        Circle smallestCircle = mass[0];
        for (Circle circle : mass)
            if (smallestCircle.getSquare() > circle.getSquare()) smallestCircle = circle;
        return smallestCircle;
    }

    // сортировка списка окружностей
    public void sortCircles() {

        Circle circle;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (mass[j].getSquare() > mass[j + 1].getSquare()) {
                    circle = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = circle;
                }
            }
        }
    }
}
