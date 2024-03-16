import java.util.Scanner;
public class BMI{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight in Kilogram:");
        Double weight=sc.nextDouble();
        System.out.println("Enter Height in Meter");
        Double height=sc.nextDouble();

        Double cal=weight/(height*height);

        String category;
        if (cal < 18.5) {
            category = "Underweight";
        } else if (cal < 25) {
            category = "Normal weight";
        } else if (cal < 30) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }
        System.out.println(category);
        
    }
}