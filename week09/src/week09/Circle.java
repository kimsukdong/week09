package week09;

public class Circle {
	private double radius;
	static double PI = 3.141592;
	
	public double getRadius() {
		return radius;
	}

	public double getPI() {
		return PI;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	private double square(double r) {
		return r*r;
	}
	public double getArea() {
		return getPI()*square(radius);
	}
	
	public double getLength() {
		return getPI()*radius * 2;
	}
}