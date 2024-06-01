package Day8Task;
import java.util.Scanner;

public class NoOfDigitsInInteger {

	public static void main(String[] args) 
	{	
		int count = 0;
		System.out.println("Enter a number");
		Scanner s =new Scanner(System.in);
		int num = s.nextInt();

	    while (num != 0) {
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);

	}

}
