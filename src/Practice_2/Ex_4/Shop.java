package Practice_2.Ex_4;

import java.util.ArrayList;
import java.util.Objects;

public class Shop {

    // список компьютеров
    ArrayList<Computer> computerList;

    // конструктор
    public Shop() {
        computerList = new ArrayList<>();
    }

    // добавление компьютера
    public void addComputer(Computer computer) {
        computerList.add(computer);
    }

    // удаление компьютера
    public void deleteComputer(Computer computer) {
        computerList.remove(computer);
    }

    // поиск компьютера по названию
    public Computer findComputer(String computerName) {

        for (Computer computer : computerList)
            if (Objects.equals(computer.name, computerName))
                return computer;

        return null;

    }
}
