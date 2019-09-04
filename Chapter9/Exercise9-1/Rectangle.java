/**
 * Author: Chloee Stephenson
 * Date: 8/25/19
 * Description: 
 *	A class that creates a rectangle
 */
public class Rectangle {
	double width = 1.0;
	double height = 1.0;
	
	//Constructor//
	Rectangle(){
		
	}
	Rectangle(double newwidth, double newheight){
		width = newwidth;
		height = newheight;
	}
	
	
	//Methods//
	double getArea() {
		return width * height;
	}
	double getPerimeter() {
		return ( 2 * width) + ( 2 * height);
		
	}
	double getheight() {
		return height;
	}
	double getwidth() {
		return width;
	}
	
}