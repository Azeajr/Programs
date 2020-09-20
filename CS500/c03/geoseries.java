/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 3.7
 */
import java.util.Scanner; 

public class geoseries
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first term: ");
        double a1=scan.nextDouble();
        
        System.out.print("Enter common ratio: ");
        double r=scan.nextDouble();
        
        System.out.print("Enter n value: ");
        int n=scan.nextInt();
        
        System.out.println("The nth term: "+(a1*Math.pow(r,(double)(n-1))));
    }
}