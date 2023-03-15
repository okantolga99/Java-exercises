public class Case {
    String model;
    String producer;
    String material;

    public Case(String model, String producer, String material) {
        this.model = model;
        this.producer = producer;
        this.material = material;
    }
    void turn_on_pc(){
        System.out.println("Pc turns on....");
    }

}
