//5. Sort the String with using String API?
//String s=”Coder Technologies”
package GEMSassignment6;

import java.util.Arrays;

public class Program5 {
	public static void main(String[] args) {
		String str = "Coder Technologies";
		System.out.println("Original String is:\n   " + str);
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			Arrays.sort(ch);
		}
		System.out.println("\nSorted String in Ascending Order:");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
	}
}
