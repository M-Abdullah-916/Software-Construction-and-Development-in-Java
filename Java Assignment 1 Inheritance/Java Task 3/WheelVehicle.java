package prob4;

abstract public class WheelVehicle extends Vehicle {

	public WheelVehicle(double speed, double distance, int wheels) {
		super(speed, distance);
		this.wheels = wheels;
	}

	private int wheels;

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	abstract void computeDistance(double speed, double distance);

}
