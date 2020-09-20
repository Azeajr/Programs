public class Administrator extends Receptionist{
    public Administrator(int idNum, double pay){
        super(idNum,pay);
    }
    
    public void meeting(String Room){
        System.out.println("Adminstrator has started a meeting in " + Room);
    }
}