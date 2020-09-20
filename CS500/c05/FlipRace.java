/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 5.6
 */

public class FlipRace{
    public static void main(String[] args){
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        int score1,score2,flip_counter;
        score1=score2=flip_counter=0;
        while(score1!=3 && score2!=3){
            flip_counter++;
            coin1.flip();
            coin2.flip();
            System.out.println(coin1+"\n"+coin2+"\n");

            if(coin1.isHeads()){
                score1++;
            }
            if(coin2.isHeads()){
                score2++;
            }
            
        }
        if(score1==score2){
            System.out.println("Tie");
        } else if(score1 < score2){
            System.out.println("Coin #2 won");
        } else{
            System.out.println("Coin #1 won");
        }
        
        System.out.println("Coin #1 Score: "+score1);
        System.out.println("Coin #2 Score: "+score2);
        System.out.println("Total Flips: "+flip_counter);
    }
}