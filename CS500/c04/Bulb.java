/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 4.2
 */
public class Bulb
{
    private int state;
    public Bulb()
    {
        state=1;//1 signifies on
    }
    
    public void turnOn()
    {
        state=1;
    }
    
    public void turnOff()
    {
        state=0;
    }
    
    public String toString()
    {
        if(state==0)
        {
            return "off";
        } else{
            return "on";
        }
    }
}