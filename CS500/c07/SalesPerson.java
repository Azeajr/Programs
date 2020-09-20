public class SalesPerson{
    private String name,phoneNumber,district;
    private double[] salesWeek = new double[7];
    
    public SalesPerson(String name, String phoneNumber, String district, double[] salesWeek){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.district=district;
        this.salesWeek=salesWeek;
    }
    public SalesPerson(String name, String phoneNumber, String district){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.district=district;
        for(double sale :salesWeek){
            sale=0.0;
        }
    }
    public void setDailyAmount(int day, double sale){
        if(day>=0 && day<=6){
            salesWeek[day]=sale;
        }
    }
    public double getDailyAmount(int day){
        return salesWeek[day];
    }
    
    public String name(){
        return name;
    }
    
    public double total(){
        double counter=0.0;
        for(double sale:salesWeek){
            counter+=sale;
        }
        return counter;
    }
    public double average(){
        return total()/7;
    }
    public String toString(){
        return "Name: "+ name +"\n"+
               "Phone Number: "+ phoneNumber +"\n"+
               "District: "+ district +"\n"+
               "Total Sales: "+ total() +"\n"+
               "Average: "+ average();
    }
}