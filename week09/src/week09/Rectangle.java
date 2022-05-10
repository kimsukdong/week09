package week09;

public class Rectangle {
	Point p1,p2;

	public void set_Rectangle(Point p3, Point p4) {
		
		p1 = p3;
		p2 = p4;
	}
	
	public int square() {
		return (p2.x -p1.x) * (p2.y-p1.y);
	}
	
	public void show() {
		p1.print();
		p2.print();
		System.out.println("넓이는 "+ square());
	}
	
	public boolean equals(Rectangle r) {
		if(this.square() == r.square()) 
			return true;
		else return false;
	}
}
