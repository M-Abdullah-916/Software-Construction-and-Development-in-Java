package shapes;

public class Rectangle extends Shapes{
	private float length;
	private float width;
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
	public float area()
	{
		return length*width;
	}
	
	public String shapeName()
	{
		return "Rectangle";
	}

}
