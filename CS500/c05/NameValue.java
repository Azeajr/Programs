/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 5.5
 */
import java.util.Scanner;

public class NameValue{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine().toUpperCase();
        int total=0;
        
        for(char ch: name.toCharArray()){
            total+=ch-64;
        }
        System.out.println("Total: "+total);
        
    }
}