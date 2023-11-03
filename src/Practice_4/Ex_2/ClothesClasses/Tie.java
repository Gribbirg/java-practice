package Practice_4.Ex_2.ClothesClasses;

import Practice_4.Ex_2.ClotheInfo.Clothes;
import Practice_4.Ex_2.ClotheInfo.ClothingSize;
import Practice_4.Ex_2.PeopleClothingInterface.MenClothing;

import java.text.NumberFormat;

// галстук
public class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина надел галстук цвета " + color + " за " + NumberFormat.getCurrencyInstance().format(price));
    }
}
