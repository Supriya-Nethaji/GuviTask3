package Day9Task;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers a, b ,c");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c) 
		{
			System.out.println("A is greatest");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greatest");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is greatest");
		}
	}

}
