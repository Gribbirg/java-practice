package Practice_7.Ex_7_8;

// можно вывести
public interface Printable {
    void print();

    // методы для вывода
    static void printMagazines(Printable[] printables) {
        for (Printable printable : printables)
            if (printable instanceof Magazine)
                printable.print();
    }

    static void printBooks(Printable[] printables) {
        for (Printable printable : printables)
            if (printable instanceof Book)
                printable.print();
    }
}
