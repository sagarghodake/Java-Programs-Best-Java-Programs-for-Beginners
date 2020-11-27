package assignment3_single_loop;

public class mainProgram 
{
	public static void main(String args[])
	{
		//program1
		System.out.println();
		int ar1[]=new int[7];
		int s[]=Program.fizzArray(ar1);
		System.out.println("1}fizzArray:");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	
		//program2
		System.out.println("\n----------");
		int ar2[]={ 2, 3,5};
		System.out.println("2}no14:\n"+Program.no14(ar2));
	
		//program3
		System.out.println("----------");
		int num1[]={1, 2, 3};
		int num2[]={2, 3, 10};
		System.out.println("3}matchUp: "+Program.matchUp(num1,num2));
		
		//program4
		System.out.println("----------");
		int ar4[]={2, 1,3,5};
		System.out.println("4}modThree: "+Program.modThree(ar4));
		
		//program5
		System.out.println("----------");
		int ar5[]={5, 6,9, 45, 99, 13, 5, 6,9};
		//int x[]=Program.sameEnds(ar5,2);
		//int y[]=Program.sameEnds(ar5, 2);
		
		System.out.println("5}sameEnds: "+Program.sameEnds(ar5,3));
		
		//program6
		System.out.println("\n----------");
		int ar6[]={6,2,5,3};
		System.out.println("6}leftShift:");
		ar6=Program.leftShift(ar6);
		for(int i=0;i<ar6.length;i++)
		{
			System.out.print(ar6[i]+" ");
		}
		
		//program7
		System.out.println("\n----------");
		int ar7[]={2, 4, 4, 2,8};
		System.out.println("7}post4:\n");
		ar7=Program.post4(ar7);
		for(int i=0;i<ar7.length;i++)
		{
			System.out.print(ar7[i]+" ");
		}

		
		//program08
		System.out.println("\n----------");
		int ar8[]={1,10,10,89};
		System.out.println("8}without10:\n");
		int a[]=Program.without10(ar8);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");

		}
		
		
		//program09
		System.out.println("\n----------");
		System.out.println("9}fizzBuzz:");
		String ar9[]=Program.fizzBuzz(1,11);
		for(int i=0;i<ar9.length;i++)
		{
			System.out.print(ar9[i]+" ");
		}
		
		
		
	}

}
