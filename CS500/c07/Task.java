public class Task implements Priority{
    private String task;
    private int priority;
    public Task(String task,int priority){
        this.task=task;
        this.priority=priority;
    }
    
    public void setPriority(int priority){
        this.priority=priority;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public String toString(){
        return "Task: " + task + "\nPriority: " + priority;
    }
}