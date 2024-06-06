package Day13Task;

import java.util.Scanner;

public class DivideByZero 
{
	public static void main(String args[]) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  value of a ");
	int a=sc.nextInt();
	System.out.println("Enter the  value of b ");
	int b=sc.nextInt();
	int c=0;
		try 
		{
			c=a/b;
		}
		catch(Exception e) {
			System.out.println("Invalid dividing value provided.");
			System.out.println("Dividing by zero is not possible hence use default value b=2");
			c=a/2;
		}
	System.out.println("Value of c is " +c);
	
	}
}
