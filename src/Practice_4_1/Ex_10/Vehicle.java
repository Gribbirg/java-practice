package Practice_4_1.Ex_10;

// родительский класс для тс
public abstract class Vehicle {
    protected final double timeToKm;
    protected final double coastToKm;

    public Vehicle(double timeToKm, double coastToKm) {
        this.timeToKm = timeToKm;
        this.coastToKm = coastToKm;
    }

    @Override
    public String toString() {
        return "время на километр = " + timeToKm +
                        ", цена за километр = " + coastToKm;
    }
}
