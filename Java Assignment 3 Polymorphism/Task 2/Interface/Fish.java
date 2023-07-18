package Interface;

public class Fish extends Animal implements pet {
	private String name;

	public Fish(int legs, String name) {
		super(legs);
		this.name = name;
	}

	public Fish(int legs) {
		super(legs);
	}

	public String getName() {
		return name;
	}

	public void setName(String petName) {
		this.name = name;
	}

	public void play() {
		System.out.println("Fish Plays with Ball");
	}

	public void eat() {
		System.out.println("Cat Eats Bacteria");
	}

}
