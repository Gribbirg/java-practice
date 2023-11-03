package Practice_4_1.Ex_9;

import ForAll.Messages;

public class Sofa extends Furniture {
    public Sofa(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Диван за " + Messages.getPriceRubles(price);
    }
}
