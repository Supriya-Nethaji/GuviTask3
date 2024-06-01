package Day9Task;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		String revStr="";
		/*char ch[]= str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) 
		{
			System.out.print(ch[i]);
		}*/
		int strLength= str.length();
		for(int i=strLength-1;i>=0;i--) {
			revStr= revStr+str.charAt(i);
		}
		System.out.println("Reversed string is:" +revStr);
	}

}
