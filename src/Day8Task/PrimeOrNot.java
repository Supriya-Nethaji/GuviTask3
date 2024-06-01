package Day8Task;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int count=0;
		for (int i = 2; i < a; i++) 
		{
            if (a % i == 0)
            {
            	count++;
            }
		}
		if(count>1) {
			System.out.println("Not a prime number");
		}
		else
		{
			System.out.println("Prime number");
		}
        	      
	}

}
