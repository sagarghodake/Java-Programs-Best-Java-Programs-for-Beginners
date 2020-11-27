//Show is use of super keyword in Car and Duster.
package GEMSassignment3;

public class Program2
{
	public static void main(String[] args) 
	{
		System.out.println("2>Program to show is use of super keyword in Car and Duster.\n");
		Duster3 ref=new Duster3();
		ref.useSuper();
		ref.callSuperClassMethod();
	}
}
class Car3 
{
	String superVariable="Car3 class-Super variable called";
	String vehicleName;
	int speedPerHour;
	int average;
	Car3()
	{
		System.out.println("Super constructor is called");
	}
	Car3(String name,int speed,int average)
	{
		super();
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		System.out.println("\nVehicle Name:"+vehicleName+"\nAverage of vehicle:"+average);
	}
	public String vehicleRun(String name,int speed,int average)
	{
		vehicleName=name;
		speedPerHour=speed;
		this.average=average;
		return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
	}
}

class Duster3 extends Car3
{
	String instanceVariable="Duster3 class-Instance variacle called.";
	Duster3()
	{
		super();
		System.out.println("Duster class constructor called");
	}
	public void useSuper()
	{
		System.out.println("\n"   +instanceVariable);
		System.out.println(super.superVariable+  "\n");
	}
	
	void callSuperClassMethod()
	{
		System.out.println("Vehicle Information is...");
		System.out.println(super.vehicleRun("Skoda", 120, 12));
	}
	
	
}
