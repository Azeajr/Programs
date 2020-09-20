/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 4.1
 */
public class ThermometerTest
{
    public static void main(String[] args)
    {
        Thermometer thermometer1, thermometer2;
        
        thermometer1= new Thermometer();
        thermometer2= new Thermometer();
        
        System.out.println("Thermometer #1: "+thermometer1 +"\nThermometer #2: "+ thermometer2+"\n");
        
        thermometer1.increase();
        System.out.println("Increase Thermometer #1");
        System.out.println("Thermometer #1: "+thermometer1 +"\nThermometer #2: "+ thermometer2+"\n");

        for(int i=0;i<12;i++)
        {
            thermometer2.increase();
        }
        System.out.println("Increase Thermometer #2");
        System.out.println("Thermometer #1: "+thermometer1 +"\nThermometer #2: "+ thermometer2+"\n");
        
        thermometer2.reset();
        System.out.println("Reset Thermometer #2");
        System.out.println("Thermometer #1: "+thermometer1 +"\nThermometer #2: "+ thermometer2);
    }
}