import java.text.NumberFormat;

public class Account{
    private final double RATE = 0.035;
    
    private long acctNumber;
    private double balance;
    private String name;
    
    public Account(String owner, long account, double initial){
        name=owner;
        acctNumber=account;
        balance=initial;
    }
    
    public double deposit(double amount){
        if(amount >0){
            balance+=amount;
            return balance;
        }else{
            System.out.println("Invalid amount.");
            return balance;
        }
        
    }
    
    public double withdraw(double amount, double fee){
        if(balance-amount-fee >=0){
            balance= balance - amount - fee;
            return balance;
        }else{
            System.our.println("Insufficient Funds.");
            return balance;
        }        
        
    }
    
    public void interest(){
        balance*=1.03;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        return acctNumber + "\t\t" + name + "\t\t" + fmt.format(balance);
    }
}