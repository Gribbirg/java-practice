package Practice_2.Ex_7;

public class Book {

    // автор
    private String author;

    // название
    private String name;

    // год
    private int year;

    // кол-во страниц
    private int size;

    // конструктор
    public Book(String author, String name, int year, int size) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.size = size;
    }

    // методы изменения и получения свойств
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
