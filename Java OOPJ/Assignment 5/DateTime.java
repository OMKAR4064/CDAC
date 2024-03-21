import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date and time (format: dd/mm/yyyy hh:mm:ss): ");
        String input = scanner.nextLine();

        // Define the input and output formats
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter outputFormatter;

        // Detect input format
        if (input.contains("/")) {
            if (input.contains(":")) {
                outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            } else {
                outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            }
        } else if (input.contains(":")) {
            if (input.contains("AM") || input.contains("PM")) {
                outputFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
            } else {
                outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            }
        } else {
            outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        }

        // Perform conversion
        LocalDateTime dateTime = LocalDateTime.parse(input, inputFormatter);
        String output = dateTime.format(outputFormatter);
        System.out.println("Converted: " + output);
    }
}