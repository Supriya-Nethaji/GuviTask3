package Day8Task;
import java.util.Scanner;

public class Print10Times {

	public static void main(String[] args) 
	{
		System.out.println("Enter a string");
		Scanner s =new Scanner(System.in);
		String str=s.nextLine();
		for(int i=1;i<=10;i++)
		{
			System.out.println(str);
		}

	}

}
