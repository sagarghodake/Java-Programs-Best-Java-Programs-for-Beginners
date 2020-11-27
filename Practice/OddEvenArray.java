package Practice;

public class OddEvenArray
{
	public static void main(String[] args) 
	{
		int i;
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int even[]=new int[(a.length/2)+1];
		int odd[]=new int[(a.length/2)+1];
		
		for(i=0;i<even.length;i++)
		{
			if(a[i]%2==0)
			{
				even[i]=a[i];
			}
			else 
			{
				odd[i]=a[i];
			}
			
		}
		for(i=0;i<even.length;i++)
		{
			System.out.print(odd[i]+" \n\n");
			System.out.print(odd[i]+" ");			
		}
	}

}
