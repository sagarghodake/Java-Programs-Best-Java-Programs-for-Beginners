package GEMSAssignment2;

public class Program2 
{
	public static void main(String[] args) 
	{
		Vehicle2 ref=new Vehicle2("Skoda Superb(3U4)", "Skoda");
				 ref=new Vehicle2("Skoda",100);
				 ref=new Vehicle2("petrol", 100, 18);
				 ref=new Vehicle2("Honda-City", "petrol", 200, 10);
	}
}
class Vehicle2
{
	String vehicleName;
	String vehicleCompany;
	int speedPerHours;
	int average;
	String engineType;
	String gearSystem;
	
	Vehicle2(String name,String company)
	{
		vehicleName=name;
		vehicleCompany=company;
		System.out.println("Overload the constructor of Vehicle class by passing different parameters.");
		System.out.println("\nInside 1st Constructor...");
		System.out.println("Vehicle Name:"+vehicleName+" \nVehicle Company:"+vehicleCompany);
	}
	
	public Vehicle2(String name,int speed) 
	{
		vehicleName=name;
		speedPerHours=speed;
		System.out.println("\nInside 2nd Constructor...");
		System.out.println("Vehicle Name:"+vehicleName+" \nSpeed Per Hours:"+speedPerHours);
	}
	
	public Vehicle2(String type,int speed,int ave) 
	{
		engineType=type;
		speedPerHours=speed;
		average=ave;
		System.out.println("\nInside 3rd Constructor...");
		System.out.println("Engine Type:"+engineType+" \nSpeed Per Hours:"+speedPerHours+" \nAverage:"+average);
	
	}
	
	public Vehicle2(String vehicleName, String engineType, int speedPerHours, int average)
	{
		this.vehicleName=vehicleName;
		this.engineType=engineType;
		this.speedPerHours=speedPerHours;
		this.average=average;
		System.out.println("\nInside 4th Constructor...");
		System.out.println("Vehicle Name:"+vehicleName+" \nVehicle EngineeType:"+engineType+"  \nSpeed Per Hours:"+speedPerHours+" \nAverage:"+average);
	}
}
