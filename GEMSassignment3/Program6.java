// Restrict any of the method of Car to override.
package GEMSassignment3;

public class Program6 
{
	public static void main(String[] args) 
	{
		Duster6 ref=new Duster6();
		System.out.println(ref.vehicleRun("Skoda", 120, 15)+"\n");
		System.out.println(ref.vehicleRun1("Honda-City", 120, 18));	
	}

}

class Car6
{
	String vehicleName;
	int speedPerHour;
	int average;
	public final String vehicleRun(String name,int speed,int average)
	{
		System.out.println("Car03 final method can't overriden...");
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
	}
	public String vehicleRun1(String name,int speed,int average)
	{
		System.out.println("Duster03 class method is called...");
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
	}
}

class Duster6 extends Car6
{
	public String vehicleRun1(String name,int speed,int average)
	{
		System.out.println("Duster03 class overrided method is called...");
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
	}
	
}