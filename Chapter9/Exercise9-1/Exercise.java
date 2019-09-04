/**
 * Author: Chloee Stephenson
 * Date: 8/25/19
 * Description:
 * 	Uses a rectangle class to create two different rectangles of different sizes
*/

public class Exercise {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4,40);
	    System.out.println("The width is: " + r1.getwidth());
	    System.out.println("The height is: " + r1.getheight());
	    System.out.println("The area is: " + r1.getArea());
	    System.out.println("The perimeter is: " + r1.getPerimeter()); 
	    
		System.out.println("");
		
		Rectangle r2 = new Rectangle(3.5,35.9);
		System.out.println("The width is: " + r2.getwidth());
	    System.out.println("The height is: " + r2.getheight());
	    System.out.println("The area is: " + r2.getArea());
	    System.out.println("The perimeter is: " + r2.getPerimeter()); 
	}	
}
