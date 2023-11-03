package Practice_4.Ex_2.ClothesClasses;

import Practice_4.Ex_2.ClotheInfo.Clothes;
import Practice_4.Ex_2.ClotheInfo.ClothingSize;
import Practice_4.Ex_2.PeopleClothingInterface.MenClothing;
import Practice_4.Ex_2.PeopleClothingInterface.WomenClothing;

import java.text.NumberFormat;

// футболка
public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина надел футболку цвета " + color + " за " + NumberFormat.getCurrencyInstance().format(price));
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела футболку цвета " + color + " за " + NumberFormat.getCurrencyInstance().format(price));
    }
}
