public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);

        Monitor monitor = new Monitor("24G2ZE","AOC","24",resolution);

        Case cases = new Case("4000D","Corsair","Tempered Glass");

        Motherboard motherboard = new Motherboard("B650-P","MSI",4,"...");

        Pc pc = new Pc(motherboard,cases,monitor);

        pc.cases.turn_on_pc();
        pc.monitor.turn_off_monitor();
        pc.motherboard.load_operating_system("win10");

    }
}