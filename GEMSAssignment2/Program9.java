package GEMSAssignment2;

public class Program9 
{
	public static void main(String[] args) 
	{
	System.out.println("Overload the constructor of Vehicle class by passing different parameters.\n\n");
	Vehicle9 ref=new Vehicle9("Skoda-NewEdition","Skoda");
	System.out.println();
	Vehicle9 ref2=new Vehicle9("Honda-City", 120);
	System.out.println();
	ref.vehicleMethod();
	}
}
class Vehicle9
{
	String vehicleName;
	String vehicleCompany;
	int speedPerHours;
	int average;
	String engineType;
	String gearSystem;	
	Vehicle9(String name,String company)
	{
		vehicleName=name;
		vehicleCompany=company;
		System.out.println("Inside 1st Constructor...");
		System.out.println("Vehicle Name:"+vehicleName+" \nVehicle Company:"+vehicleCompany);
	}
	public Vehicle9(String name,int speed) 
	{
		vehicleName=name;
		speedPerHours=speed;
		System.out.println("Inside 2nd Constructor...");
		System.out.println("Vehicle Name:"+vehicleName+" \nSpeed Per Hours:"+speedPerHours);
	}
	
	public void vehicleMethod()
	{
		System.out.println("Method of vehicle called...");
	}
	
	{
		System.out.println("Instance Initialization Block is running");
	}
}
