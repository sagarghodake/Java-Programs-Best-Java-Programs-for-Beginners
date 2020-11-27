package Practice;
import java.lang.reflect.Array;
import java.util.*;

import array_common_operation.ArrayCommonOperation;
public class ArrayElementAsNumber 
{
	public static void main(String[] args) 
	{
		int i,j,multi=1,value=10;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of number");
		int length=sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter the number");
		for( i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int other[]=new int[a.length];
		int k=0;
		for( i=other.length-1;i>=0;i--)
		{
			other[i]=a[k];
			k++;
		}
		
		ArrayCommonOperation.printArray(other);
		for(i=0;i<other.length;i++)
		{
			if(i>0)
				{
					multi=multi*value;
				}
			sum=sum+(other[i]*multi);
		}	System.out.println(sum);
		System.out.print("Enter number to add:");
		int result=sc.nextInt();
		result=sum+result;
		System.out.println("result="+result);
		
	}
}
