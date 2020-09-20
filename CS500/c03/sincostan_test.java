/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 3.8
 */
import java.util.Random;

public class sincostan_test
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        int theta = gen.nextInt(21)+20;
        
        System.out.println("theta(radians): "+ ((double)theta));
        System.out.println("sin(theta): "+ Math.sin((double)theta));
        System.out.println("cos(theta): "+ Math.cos((double)theta));
        System.out.println("tan(theta): "+ Math.tan((double)theta));
        
    }
}