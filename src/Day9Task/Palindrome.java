package Day9Task;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		int strLength= str.length();
		String revStr="";
		for(int i=strLength-1; i>=0;i--) 
		{
			revStr = revStr+str.charAt(i);
		}
		System.out.println("Reversed string is:" +revStr);
		if(str.equals(revStr))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a palindrome");

	}

}
