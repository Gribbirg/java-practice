package Practice_4.Ex_4;

public class Computer {

    private final ComputerBrand brand;
    private final Processor processor;
    private final Memory memory;
    private final VideoCard videoCard;

    Computer(ComputerBrand brand, Processor processor, Memory memory, VideoCard videoCard) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Computer " + brand + ":\n" +
                "processor = " + processor + '\n' +
                "memory = " + memory + '\n' +
                "videoCard = " + videoCard
                ;
    }
}
