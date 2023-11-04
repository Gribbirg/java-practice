package Practice_23.Ex_2;

import ForAll.Messages;

import java.util.LinkedList;

public class LinkedQueue implements Queue {
    private final LinkedList<Object> queue;


    public LinkedQueue() {
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(Object object) {
        queue.add(object);
    }

    public Object element() {
        return queue.get(0);
    }

    public Object dequeue() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Очередь пуста!");

        return queue.pop();
    }

    public int getBusy() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
    }

    public void print() {
        for (Object o : queue) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Messages.printExNum("2");

        LinkedQueue queue1 = new LinkedQueue();

        queue1.enqueue(1);
        queue1.enqueue(8);
        queue1.enqueue(33);
        System.out.println("Busy: " + queue1.getBusy());
        queue1.print();
        System.out.println("--------------------");

        System.out.println(queue1.dequeue());
        queue1.print();
        System.out.println("--------------------");

        queue1.clear();
        queue1.print();
    }
}
