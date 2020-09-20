import java.util.Scanner;

public class TesterException{
    public static void main(String args[]) throws StringsTooLongException{
        Scanner scan = new Scanner(System.in);
        StringsTooLongException problem = new StringsTooLongException();
        
        System.out.println("Enter text:(Type DONE to end)");
        String input=scan.next();
        try{
			while(!(input.equals("DONE"))){
				System.out.println(input);
				if(input.length()>20){
					throw problem;
				}
        
				System.out.println("Enter text:(Type DONE to end)");
				input=scan.next();
			}
		}catch(StringsTooLongException exception){
			System.out.println("Caught an issue with strings.");
		}
		System.out.println("Just checking that this happens at the end.");
    }
}
