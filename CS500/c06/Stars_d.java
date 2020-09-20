public class Stars_d{
    public static void main(String[] args){
        int total=10,star=1;
        
        for(int i=0; i<total;i++){
            for(int j=0;j<(total-star)/2;j++){
                System.out.print(" ");
            }
            for(int j=0; j<star;j++){
                System.out.print("*");
            }
            if(i<total/2){
                star+=2;
            } else{
                star-=2;
            }
            System.out.print("\n");
        }
    }
}