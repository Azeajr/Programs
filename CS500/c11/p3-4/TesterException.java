import java.util.Scanner;

public class TesterException{
	public static void main(String args[]) throws InvalidDocumentCodeException{
		Scanner scan = new Scanner(System.in);
		InvalidDocumentCodeException problem = new InvalidDocumentCodeException("Not a valid document code.");
		
		System.out.println("Enter Document Code: ");
		String input = scan.next();
		
		try{
			if(input.length() == 2 && (input.charAt(0) == 'U' || input.charAt(0) == 'P' || input.charAt(0) == 'U')){
				System.out.println("Valid Document Code.");
			} else{
				throw problem;
			}
		}catch(InvalidDocumentCodeException exception){
			System.out.println("Not a valid document code.");
		}
		
		System.out.println("This shows that the program continues after catching the exception.");
		
	}
}