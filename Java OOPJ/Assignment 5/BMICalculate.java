import java.util.Scanner;

class BMICalculator {
    private double height;
    private double weight;

    // Constructor
    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // Getter and Setter methods
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return weight / (height * height);
    }
}

public class BMICalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for height and weight
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Create BMI calculator object
        BMICalculator bmiCalculator = new BMICalculator(height, weight);

        // Calculate BMI
        double bmi = bmiCalculator.calculateBMI();

        // Print the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        scanner.close();
    }
}
