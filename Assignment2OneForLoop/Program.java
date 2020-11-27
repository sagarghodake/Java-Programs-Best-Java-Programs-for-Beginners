package Assignment2OneForLoop;

public class Program 
{
	//program01
	
	public static int countEvens(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}//System.out.println("Count of even numbers:"+count);
		return count;
	}
	
	//program02
	public static int bigDiff(int a[])
	{
		int small=a[0];
		int large=a[0];
		int diff;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println("Greatest element is:"+large);
		System.out.println("Smallest element is:"+small);
		System.out.println("---");
		diff=large-small;
		return diff;
	}
	
	//proram03
	
	public static int centeredAverege(int a[])
	{
		int average,count=0,status=-1;
		int small=a[0];
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==small || a[i]==large)
			{
				status=1;
				continue;
				
			}
			else if(status==1){count++;   sum=a[i]+sum;}
		}
		System.out.println("sum is:"+sum);
		average=sum/count;
		return average;
	}	
	
	//program4
	public static int  sum13(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==13)
			{
				i++;
			}
			else
			{
				sum=sum+a[i];
			}
		}
		return sum;
	}
	
	//program05
	public static int sum67(int a[])
	{
		int sum=0,status=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==6  && status==-1 )
			{
				status=1;
				continue;
			}
			else if(a[i]==7  && status==1 )
			{
				status=-1;
				continue;
			}
			else if(status==1)
			{
				continue;				
			}
			else
			{
				sum=sum+a[i];
			}
		}return sum;
		
	}
	
	//program6
		public static boolean  has22(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==2 && a[i+1]==2)
				{
					return true;
				}
			}return false;
		}
		
		//program7
		public static boolean  lucky13(int a[])
			{
				for(int i=0;i<a.length;i++)
				{
					if(a[i]==1 || a[i]==3)
					{
						return false;
					}
				} return true;
			}	

		//program8
		public static boolean  sum28(int a[])
		{
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==2)
				{
					sum=sum+a[i];
				}
			}
			if(sum==8)
			{
				return true;
			}
			return false;
		}
		
		//program9
				public static boolean  more14(int a[])
				{
					int count1=0,count4=0;
					for(int i=0;i<a.length;i++)
					{
						if(a[i]==1)
						{
							count1++;
						}
						else if(a[i]==4)
						{
							count4++;
						}
					}
					if(count1>count4)
					{
						return true;
					}
					return false;
				}

}
