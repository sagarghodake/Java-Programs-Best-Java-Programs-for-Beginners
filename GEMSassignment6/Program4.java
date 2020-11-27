//Sort the following String characters without using String API?
//String s=”Coder Technologies”
package GEMSassignment6;

public class Program4 {
	public static void main(String[] args) {
		String str = "Coder Technologies";
		char ch[] = str.toCharArray();
		System.out.println("Original string is:\n   Coder Technologies");
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println("\nSorted String in Ascending Order:");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		// descending order
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println("\n\nSorted String in Descending Order:");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
	}
}
