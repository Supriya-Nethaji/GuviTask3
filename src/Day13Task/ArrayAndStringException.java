package Day13Task;

public class ArrayAndStringException 
{
	public static void main(String args[]) 
	{
		// ArrayIndexOutOfBounds Exception
		String arr[]=new String[3];
		try {
		for(int i=1;i<=arr.length;i++) 
		{
			arr[i]="string";
			System.out.println(arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size has been exceeded");
			e.printStackTrace();
		}
		
		System.out.println("*****************************************");
		
		//StringIndexOutOfBounds Exception
		String s="guvi";
		try {
			System.out.println(s.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String length is 3. Trying to print the char at 4 throws exception");
			e.printStackTrace();
		}
		
	}
}
