import java.util.Scanner;

public class NumberCounter{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input,table[]= new int[10];
        
        
        System.out.println("Enter a number between 1 and 100 inclusive(Enter a q to quit):");
        
        /*
        while(scan.hasNext()){
            input=scan.nextInt();
            if(input>=-25 && input<=25){
                table[input+25]++;
            }
        }
        */
       /*
        * Testing purposes.
        *
        * */ 
        
       for(int i=0;i<5000;i++){
           table[(int)(Math.random()*100)/10]++;
       }
        
        System.out.println("Value\t\tFrequency");
        for(int i=0;i<table.length;i++){
            if(table[i]>0){
                System.out.print((1+10*i)+"-"+(10+10*i)+"\t|\t");
                for(int j=0;j<table[i];j+=5){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }
}