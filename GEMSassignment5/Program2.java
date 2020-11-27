//Show the use of Extended interface, Nested interface, Functional interface and Marker
//interface in above example.

package GEMSassignment5;

import java.io.*;

public class Program2 implements Serializable
{
	public static void main(String[] args) {
		System.out.println("Interface Assignment::Program2->\nShow the use of Extended interface\nFunctional interface and Marker\ninterface in above example.\n");
		DemoAllInterface refAll=new DemoAllInterface();
		System.out.println("Interface1 methods...\nCar details are:");
		refAll.getVehicleDetails("Honda-City", "Honda");
		refAll.getVehicleQuatation(2019, 120, 20000);
		System.out.println("\nInterface2 method...");
		refAll.calculateAverage(120, 1.30);
		System.out.println("\nFunctional interface...");
		refAll.print();
		
		System.out.println("\nNestead Interface Example...");
		DemoInnerInterface refInner=new DemoInnerInterface();
		refInner.innerMethod();
		refInner.outerMethod();
	}
}



interface interface1
{
	public void getVehicleDetails(String carName,String carCompany);
	public void getVehicleQuatation(int model,int maxSpeed,int prize);
}

interface interface2 extends interface1
{
	public void calculateAverage(double distance,double time);
}

interface FunctionalInterface
{
	void print();
}

interface OuterInterface
{
	void outerMethod();
	
	interface InnerInterface
	{
		public void innerMethod();
	}
}

class DemoInnerInterface implements OuterInterface,OuterInterface.InnerInterface
{
	@Override
	public void outerMethod() {
		System.out.println("OuterInterface outerMethod is called.");
		
	}
	@Override
	public void innerMethod() {
		System.out.println("InnerInterface innerMethod is called.");
		
	}

}


class DemoAllInterface extends DemoInnerInterface implements interface2,FunctionalInterface
{

	String fourWheelerName;
	String fourWheelerCompany;
	int prize;
	int model;
	int maxSpeed;
	String engineType;
	int carPrize;
	double distance,time;
	@Override
	public void getVehicleDetails(String carName,String carCompany){
		fourWheelerName=carName;
		fourWheelerCompany=carCompany;
		System.out.println("Name of Car:"+fourWheelerName+"\nCar Company:"+fourWheelerCompany);
	}

	@Override
	public void getVehicleQuatation(int model,int maxSpeed,int carPrize){
		this.model=model;
		this.maxSpeed=maxSpeed;
		this.carPrize=carPrize;
		System.out.println("Car model:"+model+"\nMaximum speed of Car:"+maxSpeed+"\nPrize of Car:"+carPrize);
		
	}
	@Override
	public void calculateAverage(double distance,double time) {
		double average;
		this.distance=distance;
		this.time=time;
		
		average=distance/time;
		System.out.println("Average of Car:"+average);
	}

	@Override
	public void print() {
		System.out.println("Functional Interface method is called.");
		
	}


	
	
}