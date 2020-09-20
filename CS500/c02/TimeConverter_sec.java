//PP 2.8 LL9th
import java.util.Scanner;

public class TimeConverter_sec
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int hours=scan.nextInt();
        System.out.println("Enter minutes: ");
        int minutes=scan.nextInt();
        System.out.println("Enter seconds: ");
        int seconds = scan.nextInt();
        
        System.out.println("Converted time: "+(hours*3600+minutes*60+seconds)+" seconds");
    }
}