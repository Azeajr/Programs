/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 4.8
 */
public class DurationTest
{
    public static void main(String[] args)
    {
        Duration timer1 = new Duration(3,40,1,10);
        Duration timer2 = new Duration(1,10,3,40);
        System.out.println(timer1);
        System.out.println(timer1.length());
        System.out.println(timer2);
        System.out.println(timer2.length());
    }
}