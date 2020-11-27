package Practice;
import java.util.*;
public class DeleteElementOfString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string....");
		String str=sc.nextLine();
		System.out.println(str);
		
		char ch[]=str.toCharArray();
		
		System.out.println("Enter charcter to delete");
		char charcter=sc.next().charAt(0);
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==charcter)
			{
				ch[i]=' ';
				if(ch[i]==' ')
				{
				for(int j=i+1;j<ch.length;j++)
					{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					}
				}
			}
		}
		
	}

}
