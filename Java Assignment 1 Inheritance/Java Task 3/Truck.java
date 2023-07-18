package prob4;

public class Truck extends WheelVehicle {

	public Truck(double speed, double distance, int wheels, double carryingLoad) {
		super(speed, distance, wheels);
		this.carryingLoad = carryingLoad;
	}

	private double carryingLoad;

	public double getCarryingLoad() {
		return carryingLoad;
	}

	public void setCarryingLoad(double carryingLoad) {
		this.carryingLoad = carryingLoad;
	}

	@Override
	void computeDistance(double speed, double distance) {
		System.out.println("Distance is : " + speed / distance + " units");
		System.out.println("Wheel of Truck is : "+this.getWheels() +" "
				+ " and Carrying Load is : " +this.getCarryingLoad());

	}

}
