//Overload the method fuelCapacity by passing 
//the capacity in terms of liters and milliliters.
package GEMSAssignment2;

public class Program8 
{
	public static void main(String[] args) {
		
		Vehicle8 ref=new Vehicle8();
		System.out.println(ref.fuelCapacity(200));
		System.out.println(ref.fuelCapacity(200,33.14));
		System.out.println(ref.fuelCapacity(22.14));		
	}
}

class Vehicle8
{
	double fuelCapacity;
	int liters;
	double milliliters;
	
	public double fuelCapacity(int liters,double milliliters)
	{
		System.out.println("Capacity of Fuel is in Liters & Milliters:");
		this.liters=liters;
		this.milliliters=milliliters;
		return fuelCapacity=liters+milliliters;
	}
	
	public int fuelCapacity(int liters)
	{
		System.out.println("Capacity of Fuel is in liters:");
		this.liters=liters;
		return liters;
	}
	
	public double fuelCapacity(double milliters)
	{
		this.milliliters=milliliters;
		System.out.println("Capacity of Fuel is in milliliters:");
		return milliliters;
	}

}
