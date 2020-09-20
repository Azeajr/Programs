/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 6.5
 */

public class RollingDice3{
    public static void main(String[] args){
        PairOfDice pair = new PairOfDice();
        int count=0;
        for(int i=0;i<1000;i++){
            pair.roll();
            if(pair.getFirstDie()==6 && pair.getSecondDie()==6){
                count++;
            }
        }
        
        System.out.println("Number of Box Cars(Two Sixes) out of 1000: "+count);
    }
}