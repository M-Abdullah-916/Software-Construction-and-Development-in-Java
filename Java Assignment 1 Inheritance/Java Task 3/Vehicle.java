package prob4;

public abstract class Vehicle {
	private double speed;

	public Vehicle(double speed, double distance) {
		super();
		this.speed = speed;
		this.distance = distance;
	}

	private double distance;

	abstract void computeDistance(double speed, double distance);

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

}
