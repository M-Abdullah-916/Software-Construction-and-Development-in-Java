package shapes;

public class Circle extends Shapes{
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float area()
	{
		return 3.1415f*radius*radius;
	}
	
	public String shapeName()
	{
		return "Circle";
	}
}
