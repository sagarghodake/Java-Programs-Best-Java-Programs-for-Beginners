package assignment3_single_loop;

public class Program {
	// 01
	public static int[] fizzArray(int a[]) {
		int desired_length[] = a;
		int k = 0;
		if (desired_length.length == 0) {
			return new int[0];
		} else {
			for (int i = 0; i < desired_length.length; i++) {
				desired_length[i] = k;
				k++;
			}
			return a;
		}
	}

	// 02
	public static boolean no14(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1 || a[i] == 4) {
				return true;
			}
		}
		return false;
	}

	// 03
	public static int matchUp(int a[], int b[]) {
		int count = 0, diff;
		for (int i = 0; i < a.length; i++) {
			diff = b[i] - a[i];
			if (diff < 2 && diff > 0) {
				count++;
			}
		}
		return count;
	}

	// 04
	public static boolean modThree(int a[]) {
		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenCount++;
			} else if (a[i] % 2 == 1) {
				oddCount++;
			}
		}
		if (evenCount == 3 || oddCount == 3) {
			return true;
		}
		return false;

	}

	// 05
	public static boolean sameEnds(int a[], int size) {
		int i, j, k = 0;
		int x[] = new int[size];
		int y[] = new int[size];
		for (i = 0; i < x.length; i++) {
			x[i] = a[i];
		}
		for (j = a.length - size; j < a.length; j++) {
			y[k] = a[j];
			k++;
		}
		for (i = 0; i < x.length; i++) {
			if (x[i] == y[i]) {
				return true;
			}
		}
		return false;
	}

	// 06
	public static int[] leftShift(int a[]) {
		int temp = 0, i = 0;
		for (i = 0; i < a.length - 1; i++) {
			temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}
		return a;
		}

	// 07
	public static int[] post4(int a[]) {
		
		int i,start=0,k=0;
		for(i=a.length-1;i>=0;i--)
		{
			if(a[i]==4)
			{
				start=i;
				break;
			}
		}//System.out.println(i);
		int post[]=new int[(a.length-start)-1];
		for(i=start+1;i<a.length;i++)
		{
			
			post[k]=a[i];
			k++;
			
		}
		return post;
	}

	// 08
	public static int[] without10(int a[]) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] == 10) {
				a[i] = 0;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] == 0) 
			{
				for (int j = a.length - 1; j >= 0; j--) 
				{
					if (a[j] != 0 && j>i) 
					{
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
						break;
					}
				}
			}

		}
		return a;
	}

	// 09
	public static String[] fizzBuzz(int start, int end) {
		int i;
		int j = 0;
		String a[] = new String[end - start];
		for (i = start; i < end; i++, j++) {
			if (i % 3 == 0) {
				a[j] = "fizz";
			} else if (i % 5 == 0) {
				a[j] = "buzz";
			} else
				a[j] = i + "";
		}
		return a;
	}
}
