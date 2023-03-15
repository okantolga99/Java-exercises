public class Monitor {
    String model;
    String producer;
    String size;
    Resolution resolution;

    public Monitor(String model, String producer, String size, Resolution resolution) {
        this.model = model;
        this.producer = producer;
        this.size = size;
        this.resolution = resolution;
    }
    void turn_off_monitor(){
        System.out.println("Monitor turns off....");
    }
}
