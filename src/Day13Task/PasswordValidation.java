package Day13Task;

import java.util.Scanner;

public class PasswordValidation 
{
	public static void main(String[] args) 
	{
		String password="abcd@123";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name ");
		String name=sc.next();
		System.out.println("Enter the password ");
		String str=sc.next();
		
		try 
		{
			if(str.equals(password))
				System.out.println("Welcome " + name + "!!!");
			else
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Invalid password. Please enter a valid password");
		}


	}

}