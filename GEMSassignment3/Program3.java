//Replace some existing properties of Vehicle in Car and Replace
//the some existing properties of Car in Duster.
package GEMSassignment3;

public class Program3 
{
	public static void main(String[] args) 
	{
		Duster03 ref=new Duster03();
		System.out.println(ref.vehicleRun("Skoda", 160, 12));
	}
}

class Car03
{
	String vehicleName;
	int speedPerHour;
	int average;
	public String vehicleRun(String name,int speed,int average)
	{
		System.out.println("Car03 method is called...");
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
	}
}

class Duster03 extends Car03
{
	public String vehicleRun(String name,int speed,int average)
	{
		System.out.println("Duster03 class  overrided method is called...");
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
	}
	
}
