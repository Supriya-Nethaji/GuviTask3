package Day9Task;

import java.util.Scanner;

public class HotelTarrif {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Month: ");
		int month=s.nextInt();
		System.out.println("Enter room rent: ");
		float roomRent=s.nextFloat();
		System.out.println("Enter number of days stayed: ");
		int noOfDaysStayed=s.nextInt();
		float Tarrif;
		switch(month) 
		{
			case 1,2,3,7,8,9,10:{
				Tarrif=noOfDaysStayed*(int)roomRent;
				System.out.println("Total Tarrif = " + String.format("%.02f", Tarrif));
				break;
			}
			
			case 4,5,6,11,12:{
				float RevRoomRent=roomRent+ (roomRent*20/100);
				Tarrif=noOfDaysStayed*(int)RevRoomRent;
				System.out.println("Total Tarrif = " + String.format("%.02f", Tarrif));
				break;
			}
		}
		
	}

}
