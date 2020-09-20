public class Receptionist extends Employee{
    public Receptionist(int idNum, double pay){
        super(idNum,pay);
    }
    
    public void takeCall(){
        System.out.println("The receptionist is taking a call.");
    }
}