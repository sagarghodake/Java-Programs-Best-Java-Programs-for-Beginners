//remove spaces to the last
package kanka_soft;
import java.util.*;
import array_common_operation.ArrayCommonOperation;

public class Program5
{
	public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=sc.nextLine();
			int i,j;
			char temp;
			char ch[]=new char[str.length()];
			for(i=0;i<ch.length;i++)
			{
				ch[i]=str.charAt(i);
			}
			for(i=0;i<ch.length;i++)
			{
				for(j=i+1;j<ch.length;j++)
				{
					if(ch[i]==' ')
					{	
						temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
				ArrayCommonOperation.printArray(ch);
			}
			System.out.println("Resultant String is....");
			ArrayCommonOperation.printArray(ch);
		}
}



