/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 4.9
 */
public class Die
{
    private final int MAX=6;
    private int facevalue;
    
    public Die()
    {
        facevalue=1;
    }
    
    public int roll()
    {
        facevalue=(int)(Math.random()*MAX)+1;
        return facevalue;
    }
    
    public void setFaceValue(int value)
    {
        facevalue=value;
    }
    
    public int getFaceValue()
    {
        return facevalue;
    }
    
    public String toString()
    {
        return Integer.toString(facevalue);
    }
}