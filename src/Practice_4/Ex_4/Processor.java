package Practice_4.Ex_4;

// процессоры
public class Processor {
    private final int numberOfCores;
    private final int maximumNumberOfThreads;
    private final double baseCPUFrequency;

    // конструктор
    Processor(int numberOfCores, int maximumNumberOfThreads, double baseCPUFrequency) {
        this.numberOfCores = numberOfCores;
        this.maximumNumberOfThreads = maximumNumberOfThreads;
        this.baseCPUFrequency = baseCPUFrequency;
    }

    // в строку
    @Override
    public String toString() {
        return "Processor{" +
                "numberOfCores=" + numberOfCores +
                ", maximumNumberOfThreads=" + maximumNumberOfThreads +
                ", baseCPUFrequency=" + baseCPUFrequency +
                '}';
    }
}
