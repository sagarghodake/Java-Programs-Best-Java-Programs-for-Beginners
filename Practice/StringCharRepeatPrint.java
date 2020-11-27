package Practice;

import java.util.Scanner;

public class StringCharRepeatPrint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string here...");
		String str=sc.next();
		
		System.out.println("Enter index of charcter:");
		int index=sc.nextInt();
		System.out.println("Enter count of charcter:");
		int count=sc.nextInt();
		StringCharRepeatPrint.concatString(str, index, count);
		}
	
	public static void concatString(String str, int index, int count){
		char ch[]=str.toCharArray();
		System.out.println("Resultant string is...\n-------------------");
		for(int i=0;i<ch.length;i++){
			if(i==index){
				for(int j=1;j<=count;j++){
					System.out.print(ch[index]);
				}
			}
			System.out.print( ch[i]);
		}	
	}
}
