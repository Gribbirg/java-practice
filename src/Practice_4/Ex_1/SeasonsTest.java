package Practice_4.Ex_1;

import ForAll.Messages;

public class SeasonsTest {
    public static void main(String[] args) {

        Messages.printExNum("4.1");

        Seasons bestSeason = Seasons.AUTUMN;

        // вывод любимого времени года
        Seasons.printLove(bestSeason);
        System.out.println();

        // вывод всех описаний
        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }
    }
}
