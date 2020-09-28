package java_day4;

public class Square extends Shape {
	float side;
	public Square(String name,float side) {
		super(name);
		this.side=side;

	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public float calculateArea() {
		float areaOfSquare=side*side;
		return areaOfSquare;
	}
}