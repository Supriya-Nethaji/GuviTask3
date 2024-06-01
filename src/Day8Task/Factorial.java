package Day8Task;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s =new Scanner(System.in);
		int fact=1;
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Fatorial is: " +fact);
	}

}
