package GEMSassignment6;
import java.util.*;

import array_common_operation.ArrayCommonOperation;
public class Program6
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string length");
		int length=sc.nextInt();
		System.out.println("Enter string here...");
		String str=sc.next();
		char ch[]=new char[length];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			System.out.print(ch[i]+" ");
		}
	}
}
