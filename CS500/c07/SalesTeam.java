import java.util.ArrayList;

public class SalesTeam{
    private String teamName;
    private ArrayList<SalesPerson> salesteam = new ArrayList<SalesPerson>();
    
    public SalesTeam(String teamName){
        teamName=teamName;
    }
    
    public void addSalesPerson(SalesPerson teammate){
        salesteam.add(teammate);
    }
    
    public void weeklyReport(){
        double teamtotal=0.0;
        for(SalesPerson member:salesteam){
            System.out.println("Name: " + member.name());
            System.out.println("Total: " + member.total() + "\n");
            teamtotal+=member.total();
        }
        System.out.println("Team Total: " + teamtotal + "\n");
    }
}