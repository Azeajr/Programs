import java.util.Scanner;

public class Coinconverter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of quarters : ");
        int q=scan.nextInt();
        
        System.out.print("Enter number of dimes : ");
        int d=scan.nextInt();
        
        System.out.print("Enter number of nickels : ");
        int n=scan.nextInt();
        
        System.out.print("Enter number of pennies : ");
        int p=scan.nextInt();
        
        System.out.println("Total: "+(q*0.25+d*0.10+n*0.05+p*0.01));
    }
}