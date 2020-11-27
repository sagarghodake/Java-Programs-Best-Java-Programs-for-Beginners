//First non-repetitive number in array
package Practice;
import java.util.*;
public class FirstRepetativeNumber {
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
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				if(count==1){
					System.out.println("First repetitive number is::-"+arr[i]);
					}
				}
			}
		}	
		if(count==0)
				System.out.println("no any non repetitive number");
	}
}
