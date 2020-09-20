/*
 * Name:Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 3.9
 */
import java.util.Random;

public class CylinderVolSur
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        int r = gen.nextInt(20)+1;
        int h = gen.nextInt(20)+1;
        System.out.println("Cylinder Radius: "+r);
        System.out.println("Cylinder Height: "+h);
        System.out.println("Cylinder Volume: "+Math.PI*r*r*h);
        System.out.println("Cylinder Surface Area: "+2*Math.PI*r*h);
    }
}