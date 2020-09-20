/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 4.9
 */
public class RollingDice2
{
    public static void main(String[] args)
    {
        PairOfDice pair=new PairOfDice();
        
        pair.roll();
        
        System.out.println(pair+"\nSum of Dice: "+pair.sumOfDice());
    }
}