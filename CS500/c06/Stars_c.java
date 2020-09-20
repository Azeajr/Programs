public class Stars_c{
    public static void main(String[] args){
        int total = 10;
        for(int i=0;i<total;i++){
            for(int j=0;j<total;j++){
                if(j<i){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }

            }
            System.out.print("\n");
        }
    }
}