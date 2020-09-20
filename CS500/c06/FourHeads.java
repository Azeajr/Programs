/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 6.6
 */

public class FourHeads{
    public static void main(String[] args){
        Coin coin1 = new Coin();
        int headCounter=0,flipCounter=0;        
        
        while(headCounter<4){
            coin1.flip();
            flipCounter++;
            
            if(coin1.isHeads()){
                headCounter++;
            }
        }
        System.out.println("Total number of flips: "+flipCounter);
        System.out.println("Number of Heads in a row: "+headCounter);
        
    }
}