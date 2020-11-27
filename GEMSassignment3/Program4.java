//Show the use of Dynamic Method Dispatch in above inheritance.
package GEMSassignment3;

public class Program4 
{
	public static void main(String[] args) 
	{
		{
			Car4 parent=new Duster4();
			System.out.println(parent.vehicleRun("Hond-City", 178, 21));
		}
	}
}	

	class Car4
	{
		String vehicleName;
		int speedPerHour;
		int average;
		public String vehicleRun(String name,int speed,int average)
		{
			System.out.println("Car03 method is called...");
			vehicleName=name;
			speedPerHour=speed;
			this.average=average;
			return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
		}
	}

	class Duster4 extends Car4
	{
		public String vehicleRun(String name,int speed,int average)
		{
			System.out.println("Duster03 class  overrided method is called...");
			vehicleName=name;
			speedPerHour=speed;
			this.average=average;
			return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average;
		}
		
	}

		
	

