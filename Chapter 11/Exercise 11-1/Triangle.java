import static java.lang.Math.sqrt;

public class Triangle {
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	Triangle(){
		
	}
	Triangle(double newside1, double newside2, double newside3){
		side1 = newside1;
		side2 = newside2;
		side3 = newside3;
	}
	public double getside1() {
		return side1;
	}
	public void setside1(double side1) {
		this.side1= side1;
	}
	public double getside2() {
		return side2;
	}
	public void setside2(double side2) {
		this.side2= side2;
	}
	public double getside3() {
		return side3;
	}
	public void setside3(double side3) {
		this.side3= side3;
	}
	public double getArea() {
		double si = (side1 + side2 + side3) / 2;
		return sqrt(si * (si - side1)*(si - side2)*(si - side3));
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
