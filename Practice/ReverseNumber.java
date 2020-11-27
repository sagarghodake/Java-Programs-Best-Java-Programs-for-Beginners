package Practice;
import java.util.*;

import array_common_operation.ArrayCommonOperation;
public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse...");
		int num=sc.nextInt();
		int digit,reverse=0;
		while(num!=0)
		{
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
			System.out.println("Reversed number is:"+reverse);
		}
		System.out.println("Reversed number is:");
	}

}
