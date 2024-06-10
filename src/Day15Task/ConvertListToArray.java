package Day15Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ConvertListToArray {

	public static void main(String[] args) 
	{
		ArrayList<String> aList=new ArrayList<>();
		aList.add("Arun");
		aList.add("Hema");
		aList.add("Deepa");
		System.out.println("Printing elements of ArrayList");
		Iterator itr=aList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("___________________");
		System.out.println("Printing the array");
		
		//CONVERTING LIST TO ARRAY
		
		String arr[]= new String[aList.size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=aList.get(i);
			System.out.print(arr[i] + " ");
		}
		
				
	}

}
