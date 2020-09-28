/*Create a class named Rectangle . The class Rectangle is a derived class of Shape. Include the following private attributes / member variables.
 Integer length
 Integer breadth
 Include a 3-argument constructor. The order of the arguments is name, length, breadth
 Include getters and setters.
 Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the rectangle.*/


package java_day4;

public class Rectangle extends Shape{

	private float length;
	private float breadth;
	public Rectangle(String name,float length,float breadth) {
		super(name);
		this.length=length;
		this.breadth=breadth;
	
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public float calculateArea() {
		float areaOfRectangle=length*breadth;
		return areaOfRectangle;
	}

	

	
}