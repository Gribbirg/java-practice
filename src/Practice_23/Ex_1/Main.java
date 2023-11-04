package Practice_23.Ex_1;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {
        Messages.printExNum("1");

        ArrayQueueModule.create(5);

        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(8);
        ArrayQueueModule.enqueue(33);
        System.out.println("Busy: " + ArrayQueueModule.getBusy());
        ArrayQueueModule.print();
        System.out.println("--------------------");

        System.out.println(ArrayQueueModule.dequeue());
        ArrayQueueModule.print();
        System.out.println("--------------------");

        ArrayQueueModule.clear();
        ArrayQueueModule.print();
        System.out.println("--------------------------------------------------------------------------------");


        ArrayQueueADT queueADT = new ArrayQueueADT(5) {};

        ArrayQueueADT.enqueue(queueADT, 1);
        ArrayQueueADT.enqueue(queueADT, 8);
        ArrayQueueADT.enqueue(queueADT, 33);
        System.out.println("Busy: " + ArrayQueueADT.getBusy(queueADT));
        ArrayQueueADT.print(queueADT);
        System.out.println("--------------------");

        System.out.println(ArrayQueueADT.dequeue(queueADT));
        ArrayQueueADT.print(queueADT);
        System.out.println("--------------------");

        ArrayQueueADT.clear(queueADT);
        ArrayQueueADT.print(queueADT);
        System.out.println("--------------------------------------------------------------------------------");


        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(8);
        queue.enqueue(33);
        System.out.println("Busy: " + queue.getBusy());
        queue.print();
        System.out.println("--------------------");

        System.out.println(queue.dequeue());
        queue.print();
        System.out.println("--------------------");

        queue.clear();
        queue.print();
        System.out.println("--------------------------------------------------------------------------------");

    }
}
