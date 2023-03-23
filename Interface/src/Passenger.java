//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Passenger implements InternationalTravelRules {
    public int departurefee;
    public boolean politicalban;
    public boolean visa;
    public boolean vaccine;

    public Passenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fee you deposit : ");
        this.departurefee = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you have any political ban ? (yes or no) ");
        String answer1 = scanner.nextLine();
        if (answer1.equals("yes")) {
            this.politicalban = true;
        } else {
            this.politicalban = false;
        }

        System.out.println("Do you have a visa ? (yes or no)");
        String answer2 = scanner.nextLine();
        if (answer2.equals("yes")) {
            this.visa = true;
        } else {
            this.visa = false;
        }

        System.out.println("Did you get a COVID-19 vaccine ? (yes or no)");
        String answer3 = scanner.nextLine();
        if (answer3.equals("yes")) {
            this.vaccine = true;
        } else {
            this.vaccine = false;
        }

    }

    public boolean departureFeeControl() {
        if (this.departurefee < 150) {
            System.out.println("Please check your departure fee! ");
            return false;
        } else {
            System.out.println("Departure fee check is completed...");
            return true;
        }
    }

    public boolean politicalBanControl() {
        if (this.politicalban) {
            System.out.println("You have a political ban.You can not go abroad!");
            return false;
        } else {
            System.out.println("Political ban check is completed...");
            return true;
        }
    }

    public boolean visaControl() {
        if (this.visa) {
            System.out.println("Visa check is completed... ");
            return true;
        } else {
            System.out.println("You don't have a visa!");
            return false;
        }
    }

    public boolean vaccineControl() {
        if (this.vaccine) {
            System.out.println("Vaccine check is completed...");
            return true;
        } else {
            System.out.println("You can't go abroad without getting a COVID-19 vaccine!");
            return false;
        }
    }
}

