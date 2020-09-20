/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 4.1
 */
public class Thermometer
{
    private double current_temp;
    
    public Thermometer()
    {
        current_temp=37.0;
    }
    
    public double getTemperature()
    {
        return current_temp;
    }
    
    public void increase()
    {
        current_temp+=0.1;
    }
    
    public void reset()
    {
        current_temp=37.0;
    }
    
    public String toString()
    {
        return Double.toString(current_temp);
    }
    
}