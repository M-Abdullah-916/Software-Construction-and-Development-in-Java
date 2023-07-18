package Lab2;

public class Tape extends Publications {
	private float timeInMinutes;

	public float getTimeInMinutes() {
		return timeInMinutes;
	}

	public void setTimeInMinutes(float timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}


	public void displayDetails() {
		super.displayDetails();
		System.out.println(timeInMinutes+" mins");
	}

}
