package Practice;
import java.util.*;
public class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		do
		{
		System.out.println("\nEnter number to check automorphic or not...");
		num=sc.nextInt();
		int square,rem;
		square=num*num;
		if(square>=10)
		{
			rem=square%10;
			if(rem==num)
			{
				System.out.println("Entered number is automorphic");
			}
			else if(num>=20 && num<=100)
			{
				rem=square%100;
				if(rem==num)
				{
					System.out.println("Entered number is automorphic");
				}
			}
			else
			{
				System.out.println("Entered number is not automorphic");
			}
		}
		}
		while(num>=0 && num<=100);
		
		
	}

}
