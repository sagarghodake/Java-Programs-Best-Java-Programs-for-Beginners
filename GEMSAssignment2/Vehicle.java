package GEMSAssignment2;

public class Vehicle {
	public static void main(String[] args) {
		System.out.println("State & Behaviours of Vehicle:\n");

		StateBehaviour vehicle = new StateBehaviour();
		System.out.println("Vehicle Name is:");
		vehicle.setVechicleName("Honda City-Verna");
		System.out.println(vehicle.getVehicleName());

		System.out.println("Company of vehicle is:");
		vehicle.setVehicleCompany("Honda");
		System.out.println(vehicle.getVehicleCompany());

		System.out.println("Speed KM/Hours is:");
		vehicle.setSpeedPerHours(100);
		System.out.println(vehicle.getSpeedPerHours());

		System.out.println("Average of Vehicle is:");
		vehicle.setAverage(30);
		System.out.println(vehicle.getAverage());

		System.out.println("Engine Type of vehicle is:");
		vehicle.setEngineType("Petrol");
		System.out.println(vehicle.getEngineType());

		System.out.println("Gear system of vehicle is:");
		vehicle.setGearSystem("auto");
		System.out.println(vehicle.getGearSystem());

	}

}

class StateBehaviour {
	String vehicleName;
	String vehicleCompany;
	int speedPerHours;
	int average;
	String engineType;
	String gearSystem;
	public float speed;
	public int distance;
	public float time;

	public void setVechicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}

	public String getVehicleCompany() {
		return vehicleCompany;
	}

	public void setSpeedPerHours(int SpeedPerHours) {
		this.speedPerHours = SpeedPerHours;
	}

	public int getSpeedPerHours() {
		return speedPerHours;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getAverage() {
		return average;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setGearSystem(String gearSystem) {
		this.gearSystem = gearSystem;
	}

	public String getGearSystem() {
		return gearSystem;
	}

	public void calculateSpeed() {
		speed = distance / time;
		System.out.println("Calculated speed is:  " + speed);

	}

}
