/*Create another class called Main. In the method, create instances of the above classes and test the above classes.
All Float values are displayed correct to 2 decimal places.
All text in bold corresponds to input and the rest corresponds to output.*/


package java_day4;

import java.util.Scanner;

public class ShapeMain {

		public static void main(String[] args) {
			
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter radius of circle");
	    float radius=scanner.nextFloat();
	    Circle circle=new Circle("Circle", radius);
	    System.out.println("Area of"+circle.name+circle.calculateArea()); 
	    System.out.println("Enter side of Square");
	    float side=scanner.nextFloat();
	    Square square=new Square("Square", side);
	    System.out.println("Area of"+square.name+square.calculateArea());
	    System.out.println("Enter length of rectangle");
	    float length=scanner.nextFloat();
	    System.out.println("Enter breadth of rectangle");
	    float breadth=scanner.nextFloat();
	    Rectangle rectangle=new Rectangle("Rectangle", length, breadth);
	    System.out.println("Area of"+rectangle.name+square.calculateArea());
		}

	}

