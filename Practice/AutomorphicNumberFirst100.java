package Practice;

public class AutomorphicNumberFirst100 
{
	public static void main(String[] args) 
	{
	
		int num=100,rem,square;
		System.out.println("automorphic numbers are:");
		for(int i=0;i<num;i++)
		{
			square=i*i;
			if (square>=0 && square<=50)
			{
				rem=square%10;
				if(rem==i)
				System.out.println(i);
			}
			else if(square>=100)
			{
				rem=square%100;
				if(rem==i)
				System.out.println(i);
			}			
		}
	}

}
