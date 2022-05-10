package week09;

public class Cylinder {
	double height;
	Circle c1;
	public void set_Cylinder(Circle c , double h) {
		this.height = h;
		this.c1 = c;
	}
	
	public double getVolume() {
		return c1.getArea()*height;
	}
	
	public static void main(String[] args) {
		Circle s1 = new Circle();
		s1.setRadius(2.8);
		Cylinder s2 = new Cylinder();
		s2.set_Cylinder(s1, 5.6);
		System.out.println("원통의 체적은 = " + s2.getVolume());		
	}
}
