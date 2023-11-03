package Practice_4_1.Ex_9;

import ForAll.Messages;

public class ShoeMaker extends Furniture {
    public ShoeMaker(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Обувница за " + Messages.getPriceRubles(price);
    }
}
