import java.util.Scanner;

public class MultiWayIfGrading {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner userInput = new Scanner(System.in);
		
		//Prompt the user to enter a score from 0 - 100
		System.out.println("Enter a score from 0 - 100:");
		
		//Get the score from the user
		double score = userInput.nextDouble();

		//Declare a variable to hold the final letter grade of the student
		char grade;
		
		//Test the value of score and take the appropriate action
		if (score >= 90.0) {
			grade = 'A';
		}
		else if (score >= 80.0) {
			grade = 'B';
		}
		else if (score >= 70.0) {
			grade = 'C';
		}
		else if (score >= 60.0) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}

		//Display the results
		System.out.println("The final letter grade is: " + grade);
		
		//THIS IS BAD!!!
//		if (score >= 90.0) {
//			System.out.print("A");
//		}
//		else {
//			if (score >= 80.0) {
//				
//			}
//			else {
//				if (score >= 70.0) {
//					
//				}
//				else {
//					if (score >= 60) {
//						
//					}
//					else {
//						System.out.print("f");
//					}
//				}
//			}
//		}
		
		
		

	}
}
