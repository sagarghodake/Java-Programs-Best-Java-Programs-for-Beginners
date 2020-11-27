//7. Implement the Has-A relationship in between Car class and Engine class.
package GEMSassignment3;

public class Program7 
{
	public static void main(String[] args) 
	{
		Engine engine=new Engine("Petrol",10000,"Tata");
		
		Car7 ref=new Car7("Ferrari",150000, engine);
		ref.display();
		Car7 ref2=new Car7("Honda-City",180000, engine);
		ref2.display();
	}

}

class Car7
{
	String vehicleName;
	int speedPerHour;
	int prize;
	Engine engine;
	Car7(String name,int prize,Engine engine)
	{
		System.out.println("Car has a relation with Engine...\n");
		vehicleName=name;
		this.prize=prize;
		this.engine=engine;
		//return "Vehicle Name:"+vehicleName+" \nSpeed/hours in km:"+speedPerHour+" \nAverage of vehicle:"+average+" \n"+engine;
	}
	void display()
	{
		System.out.println("Name of Vehicle:"+vehicleName+"\nPrize of vehicle "+prize);
		System.out.println("Type of Engine:"+engine.engineType+"\nPrize of engine:"+engine.enginePrize+"\nCompany of engine:"+engine.engineCopmpanyName);
	}
	
}

class Engine 
{
	String engineType;
	int enginePrize;
	String engineCopmpanyName;
	public Engine(String type,int prize,String compName)
	{
		engineType=type;
		this.enginePrize=prize;
		engineCopmpanyName=compName;
		
	}
	
}