package Practice_13.Ex_3;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("3");

        Address[] addresses = {
                new Address("Россия, Центральный административный округ, Москва, Кремль, 1, 1, 1"),
                Address.getAddress("Россия; Москва; Москва; проспект Вернадского; 78; 4; А418"),
                Address.getAddress("Россия, Москва, Москва, проспект Вернадского, 78, 5, А418"),
                Address.getAddress("Россия. Москва. Москва. проспект Вернадского. 78. 6. А418")
        };

        for (Address address : addresses) System.out.println(address);
    }
}
