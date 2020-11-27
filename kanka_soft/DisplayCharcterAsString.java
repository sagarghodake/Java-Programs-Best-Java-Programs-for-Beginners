package kanka_soft;
import java.util.*;
public class DisplayCharcterAsString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of charcters... ");
		int length=sc.nextInt();
		System.out.println("Enter charcters... ");
		char ch[]=new char[length];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}	
		System.out.println("Another type using function");
		String str=ch.toString();
		for(int i=0;i<str.length();i++)
		{
			System.out.print(ch[i]);
		}
		
	}
}
