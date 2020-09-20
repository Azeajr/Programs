public class ManageAccount{
    public static void main(String[] args){
        Account[] accounts = new Account[30];
        String Names[]={"Bob Dylan",
                        "Ulysses S Grant",
                        "Barack Obama",
                        "George Washington",
                        "Linus Torvalds",
                        "Elon Musk",
                        "Larry Page",
                        "Carl Sassenrath",
                        "Mark Zuckerburg",
                        "Bill Gates"};
        
        for(int i=0;i<accounts.length;i++){
            accounts[i]= new Account(Names[i%Names.length],(long)(Math.random()*100000000),(double)Math.random()*100000000);
        }
        
        for(Account act:accounts){
            System.out.println(act);
        }
    }
}