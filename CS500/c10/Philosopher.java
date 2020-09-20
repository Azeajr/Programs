public class Philosopher implements Speaker{
    public void speak(){
        System.out.println("I think therefore I am");
    }
    
    public void announce(String str){
        System.out.println("(Spoke Clearly) " + str);
    }
}