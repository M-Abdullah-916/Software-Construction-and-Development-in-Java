package prob4;

abstract public class WingVehicle extends Vehicle {

	public WingVehicle(double speed, double distance, int wings) {
		super(speed, distance);
		this.wings = wings;
	}

	private int wings;

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	abstract void computeDistance(double speed, double distance);

}
