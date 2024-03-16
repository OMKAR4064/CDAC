import java.util.Scanner;
public class vowel{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character to check vowel or consonant:");
        char w=sc.next().charAt(0); 
        if(w=='a' || w=='e' || w=='e'|| w=='i' ||w=='o'  ||w=='u' ||w=='A' ||w=='E' ||w=='I'  ||w=='O'||w=='U')
        {
            System.out.println("It's a Vowel");
        }
        else
           System.out.println("It's a consonant");
    }
}