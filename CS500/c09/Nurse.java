public class Nurse extends Employee{
    public Nurse(int IdNum, double pay){
        super(IdNum,pay);
    }
    
    public evaluate(String room){
        System.println("Evaluating patient in " + room);
    }
}