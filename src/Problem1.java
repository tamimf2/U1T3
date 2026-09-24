import java.util.Scanner;
public class Problem1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Welcome to the program " + name + "!");
        System.out.println("Enter an integer");
        double num1 = scan.nextDouble();
        System.out.println("Enter another integer");
        double num2 = scan.nextDouble();
        System.out.println("Enter a third integer");
        double num3 = scan.nextDouble();
        double avg = (num1 + num2 + num3)/3;
        System.out.println("The average of " + num1 + ", " + num2 + ", " + num3 + " is " + avg);
    }
}