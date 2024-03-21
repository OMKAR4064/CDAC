import java.util.Scanner;

public class TollBoothBillGenerator {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;

    public static void main(String[] args) {
        TollBoothBillGenerator tollBooth = new TollBoothBillGenerator();
        tollBooth.showMenu();
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nToll Booth Bill Generator");
            System.out.println("1. Enter vehicle type (car, van, bus, or truck)");
            System.out.println("2. Enter number of axles");
            System.out.println("3. Enter distance traveled");
            System.out.println("4. Calculate toll fee");
            System.out.println("5. Generate bill");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type (car, van, bus, or truck): ");
                    vehicleType = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Enter number of axles: ");
                    numAxles = scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Enter distance traveled: ");
                    distanceTraveled = scanner.nextDouble();
                    break;
                case 4:
                    calculateTollFee();
                    break;
                case 5:
                    generateBill();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
    }

    private void calculateTollFee() {
        if (vehicleType != null && numAxles != 0 && distanceTraveled != 0) {
            if (vehicleType.equalsIgnoreCase("car") || vehicleType.equalsIgnoreCase("van") || vehicleType.equalsIgnoreCase("bus")) {
                tollFee = 0.25 * numAxles * distanceTraveled;
            } else if (vehicleType.equalsIgnoreCase("truck")) {
                tollFee = 0.50 * numAxles * distanceTraveled;
            } else {
                System.out.println("Invalid vehicle type. Please enter car, van, bus, or truck.");
                return;
            }
            System.out.println("Toll fee calculated: $" + tollFee);
        } else {
            System.out.println("Error: Vehicle information incomplete. Please enter vehicle type, number of axles, and distance traveled.");
        }
    }

    private void generateBill() {
        if (tollFee != 0) {
            totalAmountDue = tollFee + 2.00; // Adding processing fee
            System.out.println("\nBill Generated:");
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Number of Axles: " + numAxles);
            System.out.println("Distance Traveled: " + distanceTraveled + " miles");
            System.out.println("Toll Fee: $" + tollFee);
            System.out.println("Total Amount Due: $" + totalAmountDue);
        } else {
            System.out.println("Error: Toll fee not calculated. Please calculate toll fee first.");
        }
    }
}
