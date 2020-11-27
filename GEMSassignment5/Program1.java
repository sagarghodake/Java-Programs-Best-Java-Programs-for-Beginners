//Define the interface which shows the abstract functionality of Car. 
//Implement this interface in Car.
//Define the final shared variable in interface.
package GEMSassignment5;

public class Program1 extends Car
{
	public static void main(String[] args) {
		
		Program1 ref=new Program1();
		System.out.println("*****Car details*****\n----------------------------");
		ref.getCarDetails("Honda-City", "Honda", 1250000);
		ref.runCar(2014, 120, "Petrol", 5000);
		ref.calculateAverege(120.25, 5.7);
	}
}
interface FourWheeler
{
	public void getCarDetails(String name,String company,int prize);
	public void runCar(int model,int speed,String type,int prize); 
	public void calculateAverege(double distance,double time);
}
abstract class Car implements FourWheeler
{
	String fourWheelerName;
	String fourWheelerCompany;
	int prize;
	int model;
	int maxSpeed;
	String engineType;
	int enginePrize;
	double distance,time;
	
	public void getCarDetails(String name,String company,int prize)
	{
		fourWheelerName=name;
		fourWheelerCompany=company;
		this.prize=prize;
		System.out.println("Name of Car:"+fourWheelerName+"\nCar Company:"+fourWheelerCompany+"\nPrize of vehicle:"+prize);
	}
	
	public void runCar(int model,int speed,String type,int prize)
	{
		this.model=model;
		maxSpeed=speed;
		engineType=type;
		enginePrize=prize;
		System.out.println("Car model:"+model+"\nMaximum speed of Car:"+speed+"\nType of Engine:"+engineType+"\nPrize of engine:"+enginePrize);
	}
	
	public void calculateAverege(double distance,double time)
	{
		double average;
		this.distance=distance;
		this.time=time;
		average=distance/time;
		System.out.println("Average of Car/hours:"+average);
	}
}


