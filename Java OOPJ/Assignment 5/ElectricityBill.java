public class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    // Constructor
    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    // Method to calculate bill amount
    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7;
        } else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10;
        }
    }

    // Getter method for bill amount
    public double getBillAmount() {
        return billAmount;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of ElectricityBill
        ElectricityBill bill = new ElectricityBill("Omkar", 250);

        // Calculate bill amount
        bill.calculateBillAmount();

        // Display customer details and bill amount
        System.out.println("Customer Name: " + bill.customerName);
        System.out.println("Units Consumed: " + bill.unitsConsumed);
        System.out.println("Bill Amount: Rs. " + bill.getBillAmount());
    }
}
