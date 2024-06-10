package Day15Task;

import java.util.ArrayList;

public class ArrayListProgram 
{
	public static void main(String args[]) 
	{
		ArrayList<String> arrl=new ArrayList<>();
		arrl.add("PineApple");
		arrl.add("Apple");
		arrl.add("Banana");
		arrl.add("Orange");
		arrl.add("Papaya");
		System.out.println("After adding elements to arrayList");
		System.out.println(arrl);
		System.out.println("After removing elements from arrayList");
		arrl.removeAll(arrl);
		System.out.println(arrl);
	}
	
}
