package Day13Task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile 
{
		public static void main(String args[])
		{  
	          try
	          {    
	            FileInputStream fin=new FileInputStream("C:\\Users\\USER\\Desktop\\Java Practice\\Guvi\\src\\Day13Task\\Sample.txt");    
	            int i;  
	            while ((i = fin.read()) != -1)
	            System.out.print((char)i); 
	            System.out.println();
	            fin.close();
	          }
	          catch(Exception e)
	          {
	        	  System.out.println("File Not found. Please provide valid path/Check the filename provided");
	        	  e.printStackTrace();
	          }    
	          finally {
	        	  System.out.println("End of program");
	          }
	          
		}
}
