package Practice;

import array_common_operation.ArrayCommonOperation;

public class StringSplit 
{
	public static void main(String[] args) 
	{
		int i;
		String str="Hello I am in Squad";
		char ch[]=str.toCharArray();
		char hello[]=new char[ch.length];
		int k=0;
		for( i=ch.length-1;i>=0;i--)
		{
			if(ch[i]==' ')
			{
				for(int j=i;j<ch.length;j++)
				{
					hello[k]=ch[j];
					k++;
				}
			}
		}
		ArrayCommonOperation.printArray(hello);
		/*
		String other[]=new String[str.length()];
		other=str.split("  ");
		//ArrayCommonOperation.printArray(other);
		String rev="";
		for(i=other.length-1;i>=0;i--)
		{
			rev=rev+other[i];
			
		}
	
		System.out.println(rev);
		*/
	}

}

