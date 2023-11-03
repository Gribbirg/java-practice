package Practice_4.Ex_2.ClotheInfo;

// класс - одежда
public abstract class Clothes {
    protected ClothingSize size;
    protected double price;
    protected String color;

    public Clothes(ClothingSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
