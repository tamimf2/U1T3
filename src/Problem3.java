import java.util.Scanner;
public class Problem3
{
    void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 3-digit integer");
        int integer = scan.nextInt();
        int digit1 = integer % 10;
        int digit2 = integer % 100 / 10;
        int digit3 = integer % 1000 / 100;
        System.out.println("The reverse of " + integer + " is: " + digit1 + digit2 + digit3);
    }
}
