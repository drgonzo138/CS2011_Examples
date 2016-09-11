import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter an integer
		System.out.println("Enter an integer: ");

		//Get the input from the user
		int number = input.nextInt();
		
		//Test if the number is divisible by 5
		if (number % 5 == 0) {
			System.out.println("The integer is divisible by 5");
		}
		
		//Test if the number is even
		if (number % 2 == 0) {
			System.out.println("The integer is even.");
		}	
	}
}
