public class Dog implements Speaker{
    public void speak(){
        System.out.println("WOOF!");
    }
    
    public void announce(String str){
        System.out.println("(Growled) "+ str);
    }
}