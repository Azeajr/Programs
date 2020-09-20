public class TaskTester{
    public static void main(String[] args){
        Task tsk1 = new Task("Get groceries.",8);
        Task tsk2 = new Task("Pick up prescriptions",10);
        Task tsk3 = new Task("Do my homework.",7);
        
        
        System.out.println(tsk1);
        System.out.println(tsk2);
        System.out.println(tsk3);
        
        
        tsk1.setPriority(4);
        System.out.println(tsk1);
        
    }
}