package Practice;
import java.util.*;
public class InvertedPattern2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows to print");
		int rows=sc.nextInt();
		int i,j,k;
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=rows;k>=i;k--)
			{
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
