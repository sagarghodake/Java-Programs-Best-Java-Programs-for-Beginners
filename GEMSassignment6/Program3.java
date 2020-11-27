//3. Reverse the following String Without using String API?
//String s=”Coder Technologies”
package GEMSassignment6;


public class Program3 {
	public static void main(String[] args) {
		String str="Coder Technologies";
		
		String reversedString,reverse="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse+" ");
		
		
	}
}
