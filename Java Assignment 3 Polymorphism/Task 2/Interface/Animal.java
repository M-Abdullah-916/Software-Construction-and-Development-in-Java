package Interface;

public abstract class Animal {
	private int legs;

	public Animal(int legs) {
		super();
		this.legs = legs;
	}

	public abstract void eat();

	public void walk() {
		legs = 4;
		System.out.println("Animal Walk Randomly Having " + legs + " legs");
	}
}
