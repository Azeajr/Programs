/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 5.4
 */

import java.util.Scanner;

public class HiLow{
    public static void main(String[] args){
        int guess=1,num=(int)(Math.random()*100)+1,guess_count=0;
        
        Scanner scan = new Scanner(System.in);
        
        while(guess!=0){
            System.out.print("Please enter your guess(0 to quit):");
            guess = scan.nextInt();
            if(guess!=0){
                if(guess==num){
                    System.out.println("Correct.");
                    guess=0;
                } else if(guess > num){
                    System.out.println("Too High.");
                }else{
                    System.out.println("Too Low.");
                }
            }
            guess_count++;
            if(guess==0){
                System.out.println("Would you like to start over?" +
                            "\nType 1 for yess or 0 for no.");
                guess = scan.nextInt();
                if(guess==1){
                    num=(int)(Math.random()*100)+1;
                    System.out.println("Number of Guess: "+guess_count);
                    guess_count=0;
                }
            }
            
        }
        System.out.println("Number of Guess: "+guess_count);
        
    }
}