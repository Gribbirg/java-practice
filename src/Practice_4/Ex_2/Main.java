package Practice_4.Ex_2;

import ForAll.Messages;
import Practice_4.Ex_2.ClotheInfo.Clothes;
import Practice_4.Ex_2.ClotheInfo.ClothingSize;
import Practice_4.Ex_2.ClothesClasses.Pants;
import Practice_4.Ex_2.ClothesClasses.Skirt;
import Practice_4.Ex_2.ClothesClasses.TShirt;
import Practice_4.Ex_2.ClothesClasses.Tie;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("4.2");

        // список одежды
        Clothes[] clothes = {
                new TShirt(ClothingSize.M, 255.5, "Красный"),
                new Skirt(ClothingSize.L, 179.99, "Розовый"),
                new Tie(ClothingSize.S, 100, "Чёрный"),
                new Pants(ClothingSize.XXS, 150, "Синий")
        };

        // работа ателье
        Atelier atelier = new Atelier();
        atelier.dressMen(clothes);
        System.out.println();
        atelier.dressWomen(clothes);
    }
}
