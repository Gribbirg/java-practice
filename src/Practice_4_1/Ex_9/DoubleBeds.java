package Practice_4_1.Ex_9;

import ForAll.Messages;

public class DoubleBeds extends Furniture {
    public DoubleBeds(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Двуспальная кровать за " + Messages.getPriceRubles(price);
    }
}
