//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Istanbul Airport...");
        String terms = "International Travel Rules...\nYou should not have any political ban...\nYou should deposit 150TL departure fee...\nYou must have a visa for the country you want to travel...\nYou must get at least one dose of COVID-19 vaccine...";
        String message = "You have to apply all the terms...";

        while(true) {
            while(true) {
                System.out.println("**************************************************");
                System.out.println(terms);
                System.out.println("**************************************************");
                Passenger passenger = new Passenger();
                System.out.println("Departure fee is being checked...");
                Thread.sleep(2000);
                if (!passenger.departureFeeControl()) {
                    System.out.println(message);
                } else {
                    System.out.println("Political ban is being checked...");
                    Thread.sleep(2000);
                    if (!passenger.politicalBanControl()) {
                        System.out.println(message);
                    } else {
                        System.out.println("Visa status is being checked...");
                        Thread.sleep(2000);
                        if (!passenger.visaControl()) {
                            System.out.println(message);
                        } else {
                            System.out.println("COVID-19 vaccine is being checked");
                            Thread.sleep(2000);
                            if (passenger.vaccineControl()) {
                                System.out.println("You have applied all the terms. Enjoy your travel!");
                                return;
                            }

                            System.out.println(message);
                        }
                    }
                }
            }
        }
    }
}
