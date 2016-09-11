import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {	
		//Generate two random numbers based on the current System time
		//A better way to generate random numbers will be shown later.
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		//Prompt the user to answer the addition question
		System.out.print("What is " + number1 + " + " + number2 + "? ");

		//Get the answer from the user
		int answer = input.nextInt();

		boolean isCorrect = (number1 + number2 == answer);
		
		//Display the results
		System.out.println(
				number1 + " + " + number2 + " = " + answer + " is " +  isCorrect);
	}
}