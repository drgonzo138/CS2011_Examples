/* 	-Demonstrates Logic Errors.  
	-Here the formula is written incorrectly.
	-The program will compile and execute, but you will get 67 degrees
	  as output which is not correct. It should be 95.0.
	-(9 / 5) performs integer division not floating-point division.
*/

public class ShowLogicErrors {
	public static void main(String[] args) {
		System.out.println("Celsius 35 is Fahrenheit degree ");
		System.out.println((9 / 5) * 35 + 32);
	}
}