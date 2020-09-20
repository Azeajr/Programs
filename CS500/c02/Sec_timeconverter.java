//PP 2.9 LL9th
import java.util.Scanner;

public class Sec_timeconverter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time in seconds: ");
        int seconds=scan.nextInt();
        
        System.out.println("Converted time: " + seconds/3600 + " hours "
                                              + seconds%3600/60 + " minutes "
                                              + seconds%3600%60 + " seconds");
        
    }
}