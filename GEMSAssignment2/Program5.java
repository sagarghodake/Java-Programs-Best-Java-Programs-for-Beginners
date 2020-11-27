// Define constants in for Vehicle
//i.e. the states those are fix for all Vehicles.
package GEMSAssignment2;

public class Program5 
{
	public static void main(String[] args) 
	{
		Vehicle5 ref=new Vehicle5();
		System.out.println("Vehicle Information...");
		ref.getVehicleInfo();	
	}
}

class Vehicle5
{
	final String vehicleName="Skoda-NewEdition";
	final String companyName="Skoda";
	final String engineType="Petrol";
	final int gear=5; 
	public void getVehicleInfo()
	{
		System.out.println("Name of Vehicle:"+vehicleName+" \nVehicle Company:"+companyName+" \ntype of Engine:"+engineType+"\nGears of vehicle "+gear);
	}

}
