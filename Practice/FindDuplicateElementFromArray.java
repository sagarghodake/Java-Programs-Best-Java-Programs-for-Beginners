package Practice;
import java.util.*;

import array_common_operation.ArrayCommonOperation;
public class FindDuplicateElementFromArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of number");
		int length=sc.nextInt();
		int a[]=new int[length];
		int i,j;
		System.out.println("Enter the number");
		for( i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayCommonOperation.printArray(a);
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate element:"+a[i]);
				}

			}
		}
		
		
	}

}
