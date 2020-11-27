package kanka_soft;
import java.util.*;

import array_common_operation.ArrayCommonOperation;
public class Program1 
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
//		System.out.println(str);
		char ch[]=new char[str.length()];
		for(i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			//System.out.print(ch[i]+" ");
		}
		
		for(i=0;i<ch.length;i++)
		{
			char currentVar=ch[i];
			for(j=i+1;j<ch.length;j++)
			{
				if(currentVar==ch[j])
				{	
					ch[j]='0';
				}	
			}
		}//ArrayCommonOperation.printArray(ch);
		for(i=0;i<ch.length;i++)
		{
			 if(ch[i]=='0')
			{
				 int k=i;
			for(j=k+1;j<ch.length;j++)
				{
				char temp=ch[k];
				ch[k]=ch[j];
				ch[j]=temp;
				k++;
				ArrayCommonOperation.printArray(ch);
				}
			}
			 
			
			 
			 /*
			 else if(ch[i]==0 && ch[i+1]==0)
				{
					for(i=ch[i];i<ch.length-1;i++)
					{
						if(ch[i]!=0)
						{
						char find=ch[i];
							char temp=ch[i];
							ch[i]=ch[find];
							ch[find]=temp;
						}ArrayCommonOperation.printArray(ch);
					}
				}
			*/	
		}
	}

}
