package Day8Task;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A value: ");
		int a=s.nextInt();
		System.out.println("Enter B value: ");
		int b=s.nextInt();
		int c;
		System.out.println("Before swapping: "); 
		System.out.println("A =" +a);
		System.out.println("B =" +b);
		c=a;//c=2
		a=b;//a=3
		b=c;//b=2
		System.out.println("After swapping: "); 
		System.out.println("A =" +a);
		System.out.println("B =" +b);

	}

}
