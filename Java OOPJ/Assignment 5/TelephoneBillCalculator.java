import java.util.Scanner;

public class TelephoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter number of calls made: ");
        int numCalls = scanner.nextInt();

        System.out.println("Enter total duration of calls (in minutes): ");
        int totalDuration = scanner.nextInt();

        scanner.close();

        // Calculation of bill
        double flatRate = 10.0; // Flat rate of $10 per month
        double totalCost;

        // Considering first 100 calls charged at 50 cents each and subsequent calls at 25 cents each
        double callCost = (numCalls <= 100) ? numCalls * 0.5 : (100 * 0.5) + ((numCalls - 100) * 0.25);

        // Considering calls with duration less than 1 minute rounded up to 1 minute
        totalDuration = Math.max(totalDuration, numCalls); // Consider minimum duration of 1 minute per call
        totalCost = callCost + flatRate;

        // Displaying the bill details
        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Total Calls Made: " + numCalls);
        System.out.println("Total Duration of Calls (in minutes): " + totalDuration);
        System.out.println("Flat Rate for the Month: $" + flatRate);
        System.out.println("Total Bill Amount: $" + totalCost);
    }
}
