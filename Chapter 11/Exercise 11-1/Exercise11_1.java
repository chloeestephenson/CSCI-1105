/**
 * Author: Chloee Stephenson
 * Date: 10-30-19
 * Description: Uses the SimpleGeometricObject class and the triangle
 * class to state wether the triangle is filled as well as the color,
 * area, perimeter, and all 3 side lengths.
 */
import java.util.Scanner;

public class Exercise11_1 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("Enter Triangle side 1: ");
		double side1 = input.nextDouble();
		System.out.println("Enter Triangle side 2: ");
		double side2 = input.nextDouble();
		System.out.println("Enter Triangle side 3: ");
		double side3 = input.nextDouble();
		System.out.println("Enter a color: ");
		String color = input.next();
		System.out.println("Enter a Boolean value to indicate whether the triangle is filled: ");
		boolean filled = input.nextBoolean();
		
		Triangle t1 = new Triangle( side1, side2, side3);
		SimpleGeometricObject a1 = new SimpleGeometricObject(color, filled);
		
		System.out.println("The color is: " + a1.getColor());
		System.out.println("The triangle is filled: " + a1.isFilled());
		System.out.println("The area is: " + t1.getArea());
		System.out.println("The perimeter is: " + t1.getPerimeter());
		System.out.println(t1.toString());
	}
	
} 
