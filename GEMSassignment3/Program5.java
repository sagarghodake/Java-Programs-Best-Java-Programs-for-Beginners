//Restrict the class Duster to extend further.
package GEMSassignment3;

public class Program5 
{
	public static void main(String[] args) 
	{
		Duster5 ref=new Duster5();
		System.out.println(ref.vehicleRun("Wagnor", 120, 18));
	}

}
final class Duster5
{
	String vehicleName;
	int speedPerHour;
	int average;
	public String vehicleRun(String name,int speed,int average)
	{
		System.out.println("Duster is final class...");
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
	}
	
}

class Example 
{
	void print()
	{
		System.out.println("Example class");
	}
}
