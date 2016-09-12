import java.util.Scanner;

public class UserMenu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//You can create the text of the menu and store it in a variable.
		//NOTE: the "\n" is an escape character which inserts a new line
		//  at the end of the string.
		final String USER_MENU = "1. Add two numbers\n" + 
					  			 "2. Area of Rectangle\n" +
		              			 "3. Remainder of two numbers\n" +
		              			 "4. Exit Program\n" +
		              			 "Enter (1-4) for choice: ";

		System.out.print(USER_MENU);
		int choice = in.nextInt();

		if (choice == 1) {
			System.out.print("Enter two numbers: ");
			int x = in.nextInt();
			int y = in.nextInt();

			int sum = x + y;

			System.out.println("The sum of " + x + ", " + y + " is " + sum);
		}
		else if(choice == 2) {
			//code for option 2
		}
		else if(choice == 3) {
			//code for option 3
		}
		else if(choice == 4) {
			System.exit(0);
		}
	}
}