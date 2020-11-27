// Write a program to achieve partial abstraction in Vehicle class.
package GEMSassignments4;

public class Program1 
{
	public static void main(String[] args) 
	{
		SampleClass ref=new SampleClass();
		System.out.println("Vehicle Information...\n");
		ref.vehicleNameCompany("Skoda-NewEdition", "Skoda");
		ref.vehicleRun("White", 1250000, 22);
		ref.getCommon();
	}
}

abstract class Vehicle
{
	String vehicleName;
	String vehicleCompany;
	int vehiclePrize;
	String color;
	int averageOfVehicle;
	int speedOfVehicle;
	int gears=4;
	int wheels=4;
	int model=2020;
	public void getCommon()
	{
		System.out.println("Gears:"+gears+"\nWheels:"+wheels+"\nModel:"+model);
	}
	
	public abstract void vehicleNameCompany(String name,String company);
	abstract void vehicleRun(String color,int prize,int average);
}

class SampleClass extends Vehicle
{

	@Override
	public void vehicleNameCompany(String name, String company) {
		vehicleName=name;
		vehicleCompany=company;
		System.out.println("Vehicle Name:"+vehicleName+" \nVehicle Company:"+vehicleCompany);
	}
	@Override
	void vehicleRun(String color,int prize, int average) 
	{
		this.color=color;	
		vehiclePrize=prize;
		averageOfVehicle=average;
		System.out.println("Vehicle color:"+color+"\nPrize:"+vehiclePrize+"\nAverage:"+averageOfVehicle);
	}
	
}
