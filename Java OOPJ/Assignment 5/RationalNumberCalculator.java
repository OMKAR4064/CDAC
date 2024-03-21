import java.util.Scanner;

public class RationalNumberCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input rational numbers
        System.out.println("Enter the first rational number:");
        int num1 = scanner.nextInt();
        int denom1 = scanner.nextInt();

        System.out.println("Enter the second rational number:");
        int num2 = scanner.nextInt();
        int denom2 = scanner.nextInt();

        // Input arithmetic operation
        System.out.println("Enter the arithmetic operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        // Perform arithmetic operation
        switch (operation) {
            case '+':
                add(num1, denom1, num2, denom2);
                break;
            case '-':
                subtract(num1, denom1, num2, denom2);
                break;
            case '*':
                multiply(num1, denom1, num2, denom2);
                break;
            case '/':
                divide(num1, denom1, num2, denom2);
                break;
            default:
                System.out.println("Invalid operation.");
        }

        scanner.close();
    }

    // Method to find the greatest common divisor (GCD)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to reduce a fraction to its simplest form
    private static void reduceFraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        System.out.println("Result: " + numerator + "/" + denominator);
    }

    // Method to add two rational numbers
    private static void add(int num1, int denom1, int num2, int denom2) {
        int numerator = num1 * denom2 + num2 * denom1;
        int denominator = denom1 * denom2;
        reduceFraction(numerator, denominator);
    }

    // Method to subtract two rational numbers
    private static void subtract(int num1, int denom1, int num2, int denom2) {
        int numerator = num1 * denom2 - num2 * denom1;
        int denominator = denom1 * denom2;
        reduceFraction(numerator, denominator);
    }

    // Method to multiply two rational numbers
    private static void multiply(int num1, int denom1, int num2, int denom2) {
        int numerator = num1 * num2;
        int denominator = denom1 * denom2;
        reduceFraction(numerator, denominator);
    }

    // Method to divide two rational numbers
    private static void divide(int num1, int denom1, int num2, int denom2) {
        int numerator = num1 * denom2;
        int denominator = denom1 * num2;
        reduceFraction(numerator, denominator);
    }
}
