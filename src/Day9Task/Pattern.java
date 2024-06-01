package Day9Task;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("Enter input number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println(" ");
		}
		
	}

}
