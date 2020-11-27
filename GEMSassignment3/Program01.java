//Extend the Vehicle class by Car class and Car class by Duster class.
//Inherit the properties from Vehicle and add 
//new properties in Car and Duster
package GEMSassignment3;

public class Program01 
{
	public static void main(String[] args) 
	{
		System.out.println("Vehicle Information is...");
		Duster1 ref=new Duster1();
		System.out.println(ref.vehicleRun("Skoda", 150, 21));
		
	}
}

class Vehicle
{
	String vehicleName;
	int speedPerHour;
	int average;
	
	public String vehicleRun(String name,int speed,int average)
	{
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return vehicleName+" "+speed;
	}
}

class Car extends Vehicle
{
	public String vehicleRun(String name,int speed,int average)
	{
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return vehicleName+" "+average;
	}
}

class Duster extends Vehicle
{
	public String vehicleRun(String name,int speed,int average)
	{
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
	}
	
}

