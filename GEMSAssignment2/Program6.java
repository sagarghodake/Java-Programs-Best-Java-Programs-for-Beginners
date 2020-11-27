//Show the parameter passing in Vehicle.
package GEMSAssignment2;

public class Program6 
{
	public static void main(String[] args) 
	{
		System.out.println("Parameters passing by values");
		Vehicle6 ref=new Vehicle6("Honda-City", "Honda");
		ref.displayDetails();
		System.out.println("\nParameters passing by reference");
		ref.prize=1200000;
		ref.average=23;
		System.out.println("Prize:"+ref.prize+"\nAverage"+ref.average);
	}

}
class Vehicle6
{
	String vehicleName;
	String vehicleCompany;
	int prize;
	int average;
	
	Vehicle6(String name,String company)
	{
		vehicleName=name;	
		vehicleCompany=company;
	}
	void displayDetails()
	{
		System.out.println("Vehicle Name:"+vehicleName+"\nVehicle Company:"+vehicleCompany);
	}
}