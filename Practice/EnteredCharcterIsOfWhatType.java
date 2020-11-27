package Practice;
import java.util.*;
public class EnteredCharcterIsOfWhatType
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		String str;
		int i;
		int consonent=0,digit=0,vowel=0,special=0,space=0;
		System.out.println("Enter the statement");
		str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e' || ch[i]=='E' || ch[i]=='i' || ch[i]=='I' || ch[i]=='o' || ch[i]=='O' || ch[i]=='u' || ch[i]=='U')
			{
				vowel++;
			}
			else if((ch[i]>'a' || ch[i]<='z') || (ch[i]>'A' || ch[i]<='Z'))
			{
				consonent++;
			}
			else if(ch[i]>=48 && ch[i]<=57 )
			{
				digit++;
			}
			else if(ch[i]==' ')
			{
				space++;
			}
			else
			{
				special++;
			}
			
		}	
		System.out.println("consonent:"+consonent);
		System.out.println("digits:"+digit);
		System.out.println("vowel:"+vowel);
		System.out.println("Space:"+space);
		System.out.println("Special charcter:"+special);
	}

}
