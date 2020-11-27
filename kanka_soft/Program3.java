package kanka_soft;
import java.util.*;

import array_common_operation.ArrayCommonOperation;
public class Program3
{
	public static void main(String[] args) 
	{
		int i,j;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=new char[str.length()];
		for(i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
		}
		//ArrayCommonOperation.printArray(ch);
		
		for(i=0;i<ch.length;i++)
		{
			int currentVar=ch[i];
			for(j=i+1;j<ch.length-1;j++)
			{
				if(currentVar==ch[j+1] && currentVar==ch[j])
				{
					for(i=currentVar;i<ch.length;i++)
					{
						if(ch[i]!=0)
						{
							ch[j]=0;
							temp=ch[j];
							ch[j]=ch[i];
							ch[i]=temp;		
						}
					}	
				}
				else if(currentVar==ch[j])
				{
					ch[j]=0;
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;		
				}
				ArrayCommonOperation.printArray(ch);
			}
		}ArrayCommonOperation.printArray(ch);
	}

}
