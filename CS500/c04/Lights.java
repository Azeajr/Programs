/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 4.2
 */
public class Lights
{
    public static void main(String[] args)
    {
        Bulb bulb1, bulb2;
        bulb1=new Bulb();
        bulb2=new Bulb();
        
        System.out.println("Bulb #1: "+bulb1+"\nBulb #2: "+bulb2+"\n");
        
        bulb1.turnOff();
        System.out.println("Bulb #1: "+bulb1+"\nBulb #2: "+bulb2+"\n");
        
        bulb1.turnOn();
        System.out.println("Bulb #1: "+bulb1+"\nBulb #2: "+bulb2+"\n");
    }
}