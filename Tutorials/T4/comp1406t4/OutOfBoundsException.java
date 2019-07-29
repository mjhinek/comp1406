package comp1406t4;


/**
This exception should be thrown whenever a linked list with n elements tries to access an element X_m for any m>=n or m<0, tries to remove/modify an element X_m for any m>=n or m<0, or tries to add an element X_m for any m>n or m<0
*/
public class OutOfBoundsException extends Exception{
	
	
	
	public OutOfBoundsException(String message){
		super(message);
	}
}