package GEMSassignment3;

public class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("Vehicle Information is.....");
		Duster1 ref=new Duster1();
		System.out.println(ref.vehicleRun("Skoda", 150, 21,"Petrol",120000));
	}
}

	class Vehiclee
	{
		String vehicleName;
		String vehicleCompany;
		
		public String vehicleRun(String name,String company)
		{
			System.out.println("Vehicle class");
			vehicleCompany=company;
			vehicleName=name;
			return vehicleName;
		}
	}

	class Car1 extends Vehicle
	{
		int speedPerHour;
		int average;
		
		public String vehicleRun(String name,String company,int speed,int average)
		{
			System.out.println("car1 class");
			speedPerHour=speed;
			this.average=average;
			//return vehicleName+" "+average;
			return ("Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average);
		}
	}

	class Duster1 extends Car1
	{
		int prize;
		public String vehicleRun(String name,int speed,int average,String type,int prize)
		{
			System.out.println("\n(Duster1 class method is called.)");
			vehicleName=name;
			speedPerHour=speed;
			String engineType=type;
			this.average=average;
			this.prize=prize;
			return ("\nVehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average+" \ntype of Vehicle:"+engineType+" \nPrize:"+prize);
		}
		
		
	}

