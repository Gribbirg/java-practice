package Practice_4.Ex_4;

// память
public class Memory {

    private final int storageCapacity;
    private final int maximumReadingSpeed;
    private final int maximumWriteSpeed;

    // конструктор
    Memory(int storageCapacity, int maximumReadingSpeed, int maximumWriteSpeed) {
        this.storageCapacity = storageCapacity;
        this.maximumReadingSpeed = maximumReadingSpeed;
        this.maximumWriteSpeed = maximumWriteSpeed;
    }

    // в строку
    @Override
    public String toString() {
        return "Memory{" +
                "storageCapacity=" + storageCapacity +
                ", maximumReadingSpeed=" + maximumReadingSpeed +
                ", maximumWriteSpeed=" + maximumWriteSpeed +
                '}';
    }
}
