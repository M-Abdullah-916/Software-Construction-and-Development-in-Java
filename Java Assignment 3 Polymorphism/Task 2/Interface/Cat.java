package Interface;

public class Cat extends Animal implements pet {
	private String name;

	public Cat(int legs, String name) {
		super(legs);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String petName) {
		this.name = name;
	}

	public void play() {
		System.out.println("Cat Plays with Rubber Strings");
	}

	public void eat() {
		System.out.println("Cat Eats Chicken");
	}
}
