package Practice_7.Ex_7_8;

// жернал
public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Журнал " + name);
    }
}
