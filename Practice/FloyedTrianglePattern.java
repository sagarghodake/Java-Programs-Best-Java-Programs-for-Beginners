package Practice;

public class FloyedTrianglePattern 
{
	public static void main(String[] args) 
	{
		int i,j,rows=5,number=1;
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;
			}System.out.println();
		}
	}

}
