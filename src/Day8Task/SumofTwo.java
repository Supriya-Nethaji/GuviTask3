package Day8Task;
import java.util.Scanner;

public class SumofTwo {

	public static void main(String[] args) 
	{
		System.out.println("Enter a numbers a, b, c & d");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		if((a+b)>(c+d)) 
		{
			System.out.println("Sum of a&b is greater than c&d");
		}
		else
		{
			System.out.println("Sum of a&b is not greater than c&d");
		}
	}

}
