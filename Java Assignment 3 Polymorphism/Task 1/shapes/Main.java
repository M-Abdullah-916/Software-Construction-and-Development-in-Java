package shapes;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		float radiusMain;
		float lenghtMain;
		float widthMain;
		Shapes shapeObject;
		Rectangle rectangle;
		Circle circle;
		Sphere sphere;
		
		System.out.println("Enter Radius of The Circle : ");
		radiusMain = scanner.nextFloat();
		shapeObject = new Circle();
		((Circle) shapeObject).setRadius(radiusMain);
		System.out.println("The Area of " + ((Circle) shapeObject).shapeName() + " is :" +((Circle) shapeObject).area());
		
		
		System.out.println("Enter Length of The Rectangle : ");
		lenghtMain = scanner.nextFloat();
		shapeObject = new Rectangle();
		System.out.println("Enter Width of The Rectangle : ");
		widthMain = scanner.nextFloat();
		((Rectangle) shapeObject).setLength(lenghtMain);
		((Rectangle) shapeObject).setWidth(widthMain);
		System.out.println("The Area of " +  ((Rectangle) shapeObject).shapeName() +" is :" +((Rectangle) shapeObject).area());
		
		System.out.println("Enter Radius of The Sphere : ");
		radiusMain = scanner.nextFloat();
		shapeObject = new Sphere();
		((Sphere) shapeObject).setRadius(radiusMain);
		System.out.println("The Area of" + ((Sphere) shapeObject).shapeName() +" is :" + ((Sphere) shapeObject).area());
		
	}
}
