package Practice_23.Ex_2;

public interface Queue {
    void print();
    void enqueue(Object object);
    Object element();
    Object dequeue();
    int getBusy();
    void clear();

}
