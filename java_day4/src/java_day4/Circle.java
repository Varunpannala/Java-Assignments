/*Create a class named Circle . The class Circle is a derived class of Shape. Include the   following private attributes / member variables.
 Integer radius
 Include a 2-argument constructor. The order of the arguments is name, radius.
 Include getters and setters.
 Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the circle. [Take the value of pi as 3.14]*/

package java_day4;

public class Circle extends Shape {

	 private float radius;

	public Circle(String name,float radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		
		float areaOfCircle=(float) (Math.PI*radius*radius);
		return areaOfCircle;
	}
	 
	}