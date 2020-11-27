package kanka_soft;

import java.io.*;
import java.util.*;

public class LitmusBloxTask {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:\\Users\\sagar\\Downloads\\JavaProject.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.useDelimiter("\n"); 
		while (sc.hasNext()) 		{
			System.out.print(sc.next());
										
		}
		sc.close(); 
	}

}
