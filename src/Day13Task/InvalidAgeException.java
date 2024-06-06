package Day13Task;

public class InvalidAgeException extends Exception 
{
	public InvalidAgeException(String message) 
	{
        super("Age specified is below 18.Please provide valid age.");
    }

}
