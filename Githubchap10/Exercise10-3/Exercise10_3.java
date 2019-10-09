/**
 * Author: Chloee Stephenson 
 * Date: 9-9-19
 * Description: Implementation of the MyInteger class.
 */
public class Exercise10_3 {

    public static void main(String[] args) {

        MyInteger n1 = new MyInteger(17);
        MyInteger n2 = new MyInteger(6);
        MyInteger n3 = new MyInteger(17);

        System.out.printf("Number 1 = %d | isPrime: %B | isOdd: %B | isEven: %B\n",
                n1.getValue(), n1.isPrime(), n1.isOdd(), n1.isEven());

        System.out.printf("Number 2 = %d  | isPrime: %B  | isOdd: %B  | isEven: %B\n",
                n2.getValue(), n2.isPrime(), n2.isOdd(), n2.isEven());
        
        System.out.printf("Number 3 = %d  | isPrime: %B | isOdd: %B  | isEven: %B\n",
                n3.getValue(), n3.isPrime(), n3.isOdd(), n3.isEven());

        System.out.printf("Num 1 = Num 2: %b\n", n1.equals(n2));
        System.out.printf("Num 1 = Num 3: %b\n", n1.equals(n3));
        System.out.println("Parse int 100 string value = " + MyInteger.parseInt("100"));
        System.out.println("Parse int 150 char array value = " + MyInteger.parseInt("150".toCharArray()));

    }
}
