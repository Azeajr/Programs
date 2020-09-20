/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 4.9
 */
public class PairOfDice
{
    private Die die1,die2;
    
    public PairOfDice()
    {
        die1=new Die();
        die2=new Die();
        
    }
    
    public int getFirstDie()
    {
        return die1.getFaceValue();
    }
    
    public int getSecondDie()
    {
        return die2.getFaceValue();
    }
    
    public void setFirstDie(int faceVal)
    {
        die1.setFaceValue(faceVal);
    }
    
    public void setSecondDie(int faceVal)
    {
        die2.setFaceValue(faceVal);
    }
    
    public void roll()
    {
        die1.roll();
        die2.roll();
    }
    
    public int sumOfDice()
    {
        return die1.getFaceValue()+die2.getFaceValue();
    }
    
    public String toString()
    {
        return "Die #1: "+die1.toString()+"\nDie #2: "+die2.toString();
    }
}