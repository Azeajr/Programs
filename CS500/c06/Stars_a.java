/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 6.7a
 */

public class Stars_a{
    public static void main(String[] args){
        int total =10;
        for(int i=total;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}