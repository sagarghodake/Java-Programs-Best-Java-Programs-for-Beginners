package Practice;

public class IntToString
{
		public static void main(String[] args) 
		{
			String evenOdd[]=intToString(1,6);
			for(int i=0;i<evenOdd.length;i++)
			{
				System.out.print(evenOdd[i]+" ");
			}
		}
		public static String[] intToString(int a,int b)
		{
			int j=0;
			String evenOdd[]=new String[b-a];
			for(int i=a;i<b;i++,j++)
			{
				if(i%2==0)
				{
					evenOdd[j]="Even";
				}else if(i%2==1)
				{
					evenOdd[j]="Odd";
				}else
				evenOdd[j]=i+" ";
			}
			return evenOdd;
		}
}
