package Practice;
import java.util.*;
public class NoNRepetiiveChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of char:");
		int n=sc.nextInt();
		char ch[]=new char[n];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(i);
		}
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count=0;
			for(int j=0;i<ch.length;j++)
			{
				if(i!=j && ch[i]==ch[j])
					count++;
			}
			if(count==0)
				System.out.println(ch[i]);
		}
	}
}
