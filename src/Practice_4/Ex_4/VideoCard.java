package Practice_4.Ex_4;

// видеокарта
public class VideoCard {

    private final int videoChipOperatingFrequency;
    private final int videoMemoryCapacity;
    private final int maximumMemoryBandwidth;

    // коструктор
    VideoCard(int videoChipOperatingFrequency, int videoMemoryCapacity, int maximumMemoryBandwidth) {
        this.videoChipOperatingFrequency = videoChipOperatingFrequency;
        this.videoMemoryCapacity = videoMemoryCapacity;
        this.maximumMemoryBandwidth = maximumMemoryBandwidth;
    }

    // в строку
    @Override
    public String toString() {
        return "VideoCard{" +
                "videoChipOperatingFrequency=" + videoChipOperatingFrequency +
                ", videoMemoryCapacity=" + videoMemoryCapacity +
                ", maximumMemoryBandwidth=" + maximumMemoryBandwidth +
                '}';
    }
}
