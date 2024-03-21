import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountManagementSystem {
    static Map<Integer, BankAccount> accounts = new HashMap<>();
    static int nextAccountNumber = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank Account Management System");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money into an account");
            System.out.println("3. Withdraw money from an account");
            System.out.println("4. Display the account balance");
            System.out.println("5. Display the account holder's information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    displayBalance(scanner);
                    break;
                case 5:
                    displayAccountInfo(scanner);
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

    // Method to create a new account
    public static void createAccount(Scanner scanner) {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name, nextAccountNumber++);
        accounts.put(account.getAccountNumber(), account);

        System.out.println("Account created successfully. Account number: " + account.getAccountNumber());
    }

    // Method to deposit money into an account
    public static void deposit(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        if (accounts.containsKey(accountNumber)) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();

            BankAccount account = accounts.get(accountNumber);
            account.deposit(amount);

            System.out.println("Deposit successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Error: Account not found.");
        }
    }

    // Method to withdraw money from an account
    public static void withdraw(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        if (accounts.containsKey(accountNumber)) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            BankAccount account = accounts.get(accountNumber);
            if (account.withdraw(amount)) {
                System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
            } else {
                System.out.println("Error: Insufficient funds.");
            }
        } else {
            System.out.println("Error: Account not found.");
        }
    }

    // Method to display the account balance
    public static void displayBalance(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        if (accounts.containsKey(accountNumber)) {
            BankAccount account = accounts.get(accountNumber);
            System.out.println("Account balance: $" + account.getBalance());
        } else {
            System.out.println("Error: Account not found.");
        }
    }

    // Method to display the account holder's information
    public static void displayAccountInfo(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        if (accounts.containsKey(accountNumber)) {
            BankAccount account = accounts.get(accountNumber);
            System.out.println("Account holder's name: " + account.getAccountHolderName());
            System.out.println("Account balance: $" + account.getBalance());
        } else {
            System.out.println("Error: Account not found.");
        }
    }
}

class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
