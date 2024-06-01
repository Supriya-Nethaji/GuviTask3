package Day8Task;
import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		System.out.println("Enter age");
		Scanner s =new Scanner(System.in);
		int age=s.nextInt();
		if(age>60)
		{
			System.out.println("Senior citizen");
		}
		else
		{
			System.out.println("Not a senior citizen");
		}

	}

}
