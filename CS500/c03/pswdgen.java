/*
 * Name:Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 3.3
 */
import java.util.Random;

public class pswdgen
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        
        System.out.print("Password: "+(gen.nextInt(3)+7));
        for(int i=0;i<5;i++)
        {
            System.out.print(gen.nextInt(10));
        }
        System.out.print("-");
        for(int i=0;i<3;i++)
        {
            System.out.print((char)(gen.nextInt(26)+65));
        }
        System.out.println();
        
    }
}