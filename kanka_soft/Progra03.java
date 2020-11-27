package kanka_soft;

import array_common_operation.ArrayCommonOperation;

public class Progra03 
{
	public static void main(String[] args) 
	{
		int i,j,flag=0;
		char temp;
		char ch[]={'s','a','g','r','r','a','s'};
		char other[]=new char[ch.length];
		for(i=0;i<ch.length;i++)
		{
			int currentVar=ch[i];
			for(j=i+1;j<ch.length;j++)
			{
				if(currentVar!=ch[j])
				{
					other[i]=ch[i];
				}
				else
				{
				
				}//ArrayCommonOperation.printArray(ch);
			}
		
		}ArrayCommonOperation.printArray(other);
		
	}

}
