package Day9Task;

import java.util.Scanner;

public class Pattern_One {

	public static void main(String[] args) {
		System.out.println("Enter input number: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		for(int i = 1; i <= size; i++) 
		{ 
            for(int j = 1; j <= size; j++) 
            {
                if(i == j || j == (size - i + 1)) 
                { 
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
	}

}
