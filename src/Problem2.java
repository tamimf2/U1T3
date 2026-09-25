import java.util.Scanner;
public class Problem2
{
    void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 enter your name:");
        String p1Name = scanner.nextLine();
        System.out.println("Enter your decimal number:");
        double p1Num = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Player 2 enter your name:");
        String p2Name = scanner.nextLine();
        System.out.println("Enter your decimal number:");
        double p2Num = scanner.nextDouble();
        if (p1Num > p2Num)
        {
            System.out.println(p1Name + "'s number is larger.");
        }
        if (p1Num < p2Num)
        {
            System.out.println(p2Name + "'s number is larger.");
        }
        if (p1Num == p2Num)
        {
            System.out.println("The numbers are equal!");
        }
    }
}

