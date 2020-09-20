public class Janitor extends Employee{
    public Janitor(int IdNum, double pay){
        super(IdNum,pay);
    }
    
    public void clean(String Room){
        System.out.println("Janitor is cleaning " + Room);
    }
}