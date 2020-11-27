package GEMSAssignment2;
//Determine the speed Up of Vehicle 
//which represents behavior of Vehicle and which can get increased.
import java.util.*;
public class Program3 extends StateBehaviour
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StateBehaviour ref=new StateBehaviour();
		System.out.println("Enter distance to calculate speed:");
		ref.distance=sc.nextInt();
		System.out.println("Enter average time in hours:");
		ref.time=sc.nextFloat();
		ref.calculateSpeed();
	}

}
