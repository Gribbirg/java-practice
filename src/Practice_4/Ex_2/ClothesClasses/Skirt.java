package Practice_4.Ex_2.ClothesClasses;

import Practice_4.Ex_2.ClotheInfo.Clothes;
import Practice_4.Ex_2.ClotheInfo.ClothingSize;
import Practice_4.Ex_2.PeopleClothingInterface.WomenClothing;

import java.text.NumberFormat;

// юбка
public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела юбку цвета " + color + " за " + NumberFormat.getCurrencyInstance().format(price));
    }
}
