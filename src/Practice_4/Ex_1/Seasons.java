package Practice_4.Ex_1;

public enum Seasons {
    // времена года
    SUMMER(17.73) {
        // переобразование вывода описания
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(5.2),
    WINTER(-6.13),
    SPRING(6.3);

    // средняя температура
    private final double averageTemperature;

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // вывод любимого времени года
    static public void printLove(Seasons season) {
        switch (season) {

            case SUMMER -> System.out.println("Я люблю лето");

            case AUTUMN -> System.out.println("Я люблю осень");

            case WINTER -> System.out.println("Я люблю зиму");

            case SPRING -> System.out.println("Я люблю весну");

        }
    }

    // вывод описания
    public String getDescription() {
        return "Холодное время года";
    }

    // преобразование в строку
    @Override
    public String toString() {
        return this.name() + ": средняя температура: " + averageTemperature + ", описание: " + getDescription();
    }
}

