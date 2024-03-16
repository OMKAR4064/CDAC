import java.util.Scanner;
public class Arithmaticwidening{
    public static void main (String[] args)
    {
        char operator;
        int a=10;
        float b=15.5f;
        double d=14.2;
        
        Scanner input = new Scanner(System.in);
       System.out.println("Choose an operator: +, -, *, or /");
       operator = input.next().charAt(0);
        
        switch (operator) {
            case '+':
                    double ans= a+d;
                    System.out.println("Result of int + double: "+ans);
                    break;
            case '-':       
                    float ans1= a+b;
                    System.out.println("Result of int + float: "+ans1);
                    break;
            case '*':
                    double ans2= b + d;
                    System.out.println("Result of float + double: "+ans2);
                    break;
            case '/':
                    double ans3= a+d;
                    System.out.println("Result of int + double: "+ans3);   
                    break;
            default:
                    System.out.println("Invalid operator!");
                    break;    
        }
    }
}