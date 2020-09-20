public class StringsTooLongException extends Exception{
    StringsTooLongException(){
        super("String contains too many characters.\n");
    }
    
}