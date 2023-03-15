public class Motherboard {
    String model;
    String producer;
    int slot_number;
    String operating_system;

    public Motherboard(String model, String producer, int slot_number, String operating_system) {
        this.model = model;
        this.producer = producer;
        this.slot_number = slot_number;
        this.operating_system = operating_system;
    }
    void load_operating_system(String operating_system){
        this.operating_system = operating_system;
        System.out.println("Operating system loaded : "+operating_system);
    }


}

