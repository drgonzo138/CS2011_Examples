import java.util.Scanner;

public class IfElseDemo {
	public static void main(String[] args) {
		
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompt the user to enter an integer between 0 and 10
		System.out.println("Enter an integer between 0 - 10: ");
		
		//Get the input from the user
		int integer = in.nextInt();
		
		//Test if the integer is greater than or equal to 5
		if (integer >= 5) {
			System.out.println(integer + " is greater than or equal to 5.");
		}
		else {
			System.out.println(integer + " is less than 5.");	
		}
	}
}
