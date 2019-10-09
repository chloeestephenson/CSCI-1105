/**
 * Author: Chloee Stephenson
 * Date: 9-9-19
 * Description: MyInteger class that states if the integer is even
 * odd, and or prime.
 */
public class MyInteger {
	public int value = 0;
	
	MyInteger(){
		
	}
	MyInteger(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isEven() {
		return value  % 2 == 0;
	}
	public boolean isOdd() {
		return !isEven();
	}
	public boolean isPrime() {
		double range = Math.sqrt(value);
		for (int i = 2; i< range; i++) {
			if (value % i == 0) return false;
		}
		return true;
	}
	public static boolean isEven( int x) {
		return x % 2 == 0;
	}
	public static boolean isOdd( int x) {
		return !isEven(x);
	}
	public static boolean isPrime( int x) {
		double range = Math.sqrt(x);
		for (int i = 2; i< range; i++) {
			if (x % i == 0) return false;
		}
		return true;
	}
	public static boolean isEven( MyInteger x) {
		return MyInteger.isEven(x);
	}
	public static boolean isOdd( MyInteger x) {
		return MyInteger.isOdd(x);
	}
	public static boolean isPrime( MyInteger x) {
		return MyInteger.isPrime(x);
	}
	public boolean equals(int x) {
		return this.value == x;
	}
	public boolean equals(MyInteger x) {
		return this.value == x.value;
	}
	public static int parseInt(char[] i) {
		int output = 0;
		int power = i.length-1;
		for(int a = 0; a < i.length; a++) {
			output += Math.pow(10, power) * (int)(i[a] - '0');
			power -= 1;
		}
		return output;
	}
	public static int parseInt(String i) {
		return MyInteger.parseInt(i.toCharArray());
	}
	

}
