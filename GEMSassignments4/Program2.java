// Declare the Vehicle class as an abstract and define some abstract methods
//in Vehicle. Implement the code to override the abstract methods.
package GEMSassignments4;

public class Program2 
{
	public static void main(String[] args) 
	{
		DemoVehicle ref=new DemoVehicle();
		System.out.println("Vehicle Information... ");
		System.out.println();
		ref.getVehicleNameAndCompany("Maruti", "Suziki", 1200000);
		ref.runVehicle("Petrol", 120);
		ref.calculateAverage(12.4, 1.30);
	}
}

abstract class Vehicle2
{
	abstract void getVehicleNameAndCompany(String name,String Company,int prize);
	abstract void runVehicle(String type,int maxSpeed);
	abstract void calculateAverage(double capacity,double time);
}

class DemoVehicle extends Vehicle2
{
	String vehicleName;
	String vehicleCompany;
	int vehiclePrize;
	int speedOfVehicle;
	String engineType;
	int averageOfVehicle;
	double fuelCapcity,time; 
	
	@Override
	void getVehicleNameAndCompany(String name,String company,int prize) {
		vehicleName=name;
		vehicleCompany=company;
		vehiclePrize=prize;
		System.out.println("Vehicle Name:"+vehicleName+" \nVehicle Company:"+vehicleCompany+"\nPrize:"+vehiclePrize);
	}

	@Override
	void runVehicle(String type,int maxSpeed) {
		engineType=type;
		speedOfVehicle=maxSpeed;
		System.out.println("Engine Type:"+engineType+"\nMaximum Speed Of Vehicle:"+speedOfVehicle);
	}

	@Override
	void calculateAverage(double capacity,double time) {
		double average;
		fuelCapcity=capacity;
		this.time=time;
		average=fuelCapcity/time;
		System.out.println("Average of Vehicle/km:"+average);
	}
	
}