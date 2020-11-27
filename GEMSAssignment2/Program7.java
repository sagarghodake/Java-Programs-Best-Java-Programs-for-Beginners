// Use in instaceOf operator in Vehicle.
package GEMSAssignment2;

public class Program7 extends Vehicle7
{
	public static void main(String[] args) {
		Vehicle7 ref=new Vehicle7();
		
		System.out.println("Is vehicleName instance of String:"+(ref.vehicleName instanceof String));
		System.out.println("Is ref instance of Vehicle7:"+(ref instanceof Vehicle7));
		System.out.println();
		ref.display();
	}

}

class Vehicle7
{
	 String vehicleName="Honda-City";
	String vehicleCompany="Honda";
	int speedPerHours=120;
	public void display()
	{
		System.out.println("Vehicle Name:"+vehicleName+" \nVehicle Company:"+vehicleCompany+"\nSpeed/Hours:"+speedPerHours);
	}

	
}
