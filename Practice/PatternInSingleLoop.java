package Practice;

public class PatternInSingleLoop 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=0;i<5;i++)
		{	
			for(j=0;j<=i;j++)
			{	
				if(i<3)
				{
					System.out.print(" *");
				}
				else
				{
					if(j<i)
					{
						for(i=j;i<5;i++)
						{
							System.out.print(" *");
						}	
					}System.out.println();
				}
			}
			System.out.println();	
		}
	}	
}
