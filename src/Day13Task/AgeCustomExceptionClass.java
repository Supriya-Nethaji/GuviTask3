package Day13Task;

import java.util.Scanner;

public class AgeCustomExceptionClass 
{

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age ");
		int age=sc.nextInt();
		
		try {
			if(age<=18) 
				throw new InvalidAgeException("Please provide valid age");
			else
			System.out.println("Valid age. Permitted to vote.");
		}
		catch(InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
