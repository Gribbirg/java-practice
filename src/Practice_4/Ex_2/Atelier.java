package Practice_4.Ex_2;

import Practice_4.Ex_2.ClotheInfo.Clothes;
import Practice_4.Ex_2.ClothesClasses.Pants;
import Practice_4.Ex_2.ClothesClasses.Skirt;
import Practice_4.Ex_2.ClothesClasses.TShirt;
import Practice_4.Ex_2.ClothesClasses.Tie;

// ателье
public class Atelier {
    // одеть мужчину
    public void dressMen(Clothes[] clothes) {
        ((TShirt)clothes[0]).dressMen();
        ((Tie)clothes[2]).dressMen();
        ((Pants)clothes[3]).dressMen();
    }

    // одеть женщину
    public void dressWomen(Clothes[] clothes) {
        ((TShirt)clothes[0]).dressWomen();
        ((Skirt)clothes[1]).dressWomen();
        ((Pants)clothes[3]).dressWomen();
    }
}
