public class RationalTester{
    public static void main(String[] args){
        RationalNumber r1 = new RationalNumber(1,4);
        RationalNumber r2 = new RationalNumber(249999,1000000);
        
        System.out.println(r1.compareTo(r2));
    }
}