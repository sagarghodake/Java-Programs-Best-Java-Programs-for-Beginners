package kanka_soft;
import java.util.*;
import array_common_operation.ArrayCommonOperation;

public class Program2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start point");
		int start=sc.nextInt();
		System.out.println("Enter End point");
		int end=sc.nextInt();
		String str="www.includehelp.com";
		char ch[]=str.toCharArray();
		subString(ch,start, end);
	}
	
	public static void subString(char arr[],int count,int countEnd) 
	{
		int i;
		System.out.println("\nOriginal string is...");
		ArrayCommonOperation.printArray(arr);

		if(count<arr.length)
		{	
			System.out.println("\nResultant String is:");
			for(i=count;i<(count+countEnd);i++)
			{
				if(i<arr.length)
				System.out.print(arr[i]);
			}		
				}
		else
		{
			System.out.println("Starting Index is Invalid");
		}
	}
}
