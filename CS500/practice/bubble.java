import java.util.*;

public class bubble{
    public static void main(String[] args){
        int[] n = {22,15,8,9,11,26,24,18,14,4};
        
        System.out.println("Original: \t" + Arrays.toString(n));
        
        for(int i=0;i<n.length-1;i++){
            for (int j=0;j<n.length-i-1;j++){
                if(n[j]<n[j+1]){
                    int temp = n[j]; 
                    n[j] = n[j+1]; 
                    n[j+1] = temp; 
                }
            }
        }
        System.out.println("New: \t\t" + Arrays.toString(n));
        
    }
}