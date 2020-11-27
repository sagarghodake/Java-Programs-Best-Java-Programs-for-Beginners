package Practice;

public class StarPattern 
{
	public static void main(String[] args) 
	{
	int i,j,num=5;
	
	for( i=0;i<num;i++)
		{
			for(j=i;j<5;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	
	for(i=5;i>0;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}System.out.println();
	}

	}
	
	
	
	

}
