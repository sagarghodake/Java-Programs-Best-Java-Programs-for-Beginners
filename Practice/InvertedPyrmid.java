package Practice;

public class InvertedPyrmid 
{
	public static void main(String[] args) 
	{
		int i,j,k,rows=5;
		for(i=1;i<=rows;i++);
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for( k=rows;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
