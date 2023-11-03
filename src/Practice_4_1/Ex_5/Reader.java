package Practice_4_1.Ex_5;

public class Reader {

    public String fullName;

    public int readerTicketNum;

    public String faculty;

    public String dateOfBrith;

    public String phone;

    public Reader() {
    }

    // взять книгу
    public void takeBook(int booksCount) {
        System.out.println(fullName + " взял " + booksCount + " книги");
    }

    public void takeBook(String ... booksNames) {
        System.out.print(fullName + " взял книги: " + booksNames[0]);
        for (int i = 1; i < booksNames.length; i++) System.out.print(", " + booksNames[i]);
        System.out.println();
    }

    public void takeBook(Book ... booksNames) {
        System.out.print(fullName + " взял книги: " + booksNames[0].name);
        for (int i = 1; i < booksNames.length; i++) System.out.print(", " + booksNames[i].name);
        System.out.println();
    }

    // вернуть книгу
    public void returnBook(int booksCount) {
        System.out.println(fullName + " вернул " + booksCount + " книги");
    }

    public void returnBook(String ... booksNames) {
        System.out.print(fullName + " вернул книги: " + booksNames[0]);
        for (int i = 1; i < booksNames.length; i++) System.out.print(", " + booksNames[i]);
        System.out.println();
    }

    public void returnBook(Book ... booksNames) {
        System.out.print(fullName + " вернул книги: " + booksNames[0].name);
        for (int i = 1; i < booksNames.length; i++) System.out.print(", " + booksNames[i].name);
        System.out.println();
    }
}
