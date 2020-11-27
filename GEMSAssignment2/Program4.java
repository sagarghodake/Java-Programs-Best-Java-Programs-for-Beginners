//Define the common states and behaviors for the Vehicle.
package GEMSAssignment2;

public class Program4 {
	public static void main(String[] args) {
		Vehicle4 ref=new Vehicle4();
		ref.setCommonVehicle("Skoda-NewEdition", "Skoda", 3300000, 22);
		ref.getCommonVehicle();
		System.out.println("\n");
		Vehicle4 ref2=new Vehicle4();
		ref2.setCommonVehicle("Honda City-NewEdition", "Honda", 1350000, 12);
		ref2.getCommonVehicle();
		System.out.println();
		Vehicle4.staticFunction();
		Vehicle4.enginePrize=10200;
		System.out.println("Prize of Engine:"+Vehicle4.enginePrize);
	}
}

class Vehicle4
{
	static int enginePrize;
	String vehicleName;
	String vehicleCompany;
	int vehiclePrize;
	int average;
	
	public void setCommonVehicle(String name,String company,int prize,int average)
	{
		vehicleName=name;
		vehicleCompany=company;
		vehiclePrize=prize;
		this.average=average;
		
	}
	public void getCommonVehicle()
	{
		String localString="Vehicle Information...";
		System.out.println(localString);
		System.out.println("Name of vehicle:   "+vehicleName+" \nName of Company:   "+vehicleCompany+" \nVehicle prize:     "+vehiclePrize+" \nAverage of vehicle: "+average);
	}
	static void staticFunction()
	{
		String localVariable="String-Local variable of stringFunction ";
		System.out.println(localVariable);
	}
}