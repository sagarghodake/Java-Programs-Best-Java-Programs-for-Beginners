package Practice;
import java.util.*;
public class FirstNonRepetitive {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array length:");
			int a=sc.nextInt();
			System.out.println("Enter array elements:");
			int arr[]=new int[a];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			int count;
			for(int i=0;i<arr.length;i++)
			{
				count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(i!=j && arr[i]==arr[j])
					{
						count++;
					}
				}
				if(count==0)
					System.out.println(arr[i]);
			}	
		}
}
