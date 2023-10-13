import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters = 0;
        boolean validInput = false;

        do {
            System.out.println("Enter meter measurement: ");
            if(scan.hasNextDouble()) {
                meters = scan.nextDouble();
                if(meters > 0) {
                    validInput = true;
                } else {
                    System.out.println("You've entered an invalid value. Please try again");
                    scan.nextLine();
                }
            } else {
                System.out.println("You've entered an invalid value. Please try again");
                scan.nextLine();
            }
        } while (!validInput);

        double miles = meters * 0.00062137;
        double feet = meters * 3.28084;
        double inches = meters * 39.37008;

        System.out.printf("\n%-10s %5.2f", "Meters: ", meters);
        System.out.printf("\n%-10s %5.2f", "Miles: ", miles);
        System.out.printf("\n%-10s %5.2f", "Feet: ", feet);
        System.out.printf("\n%-10s %5.2f", "Inches: ", inches);
    }
}