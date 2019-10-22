
import java.util.Scanner;
//github
public class Group8PE7
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
	
		int floors;
		double sum = 0;
		double taken = 0;
	do{
		System.out.println("how many floors are in your building?");
		floors = kb.nextInt();
		if(floors <= 0)
		{
			System.out.println("that answer is wrong please type a number larger then 0");
		}
	}while(floors <= 0);
	
	for(int x = 0; x < floors; x++)
		{
			System.out.println("how many rooms on the floor?");
			double room = kb.nextDouble();
			sum += room;
			System.out.println("how many of those are occupied?");
			double occ = kb.nextDouble();
			taken += occ;	
		
		}
		double occupancy = taken / sum;
		double occupancy1 = occupancy * 100;
		System.out.println("The hotel can handle " + sum + " rooms");
		System.out.println("The hotel currently has " + taken + " rooms occupied");
		System.out.printf("The occupancy rate is %.1f",occupancy1);
		System.out.print("%");
	}
}