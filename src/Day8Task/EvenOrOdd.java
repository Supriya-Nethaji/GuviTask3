package Day8Task;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		

	}

}
