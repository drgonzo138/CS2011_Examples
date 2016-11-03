import javax.swing.JOptionPane;


public class JOptionPaneConfirmation {
	public static void main(String[] args) {
		String message = "Please choose an option";
		
		int choice = JOptionPane.showConfirmDialog(null, message);
		
		//If statements using 0, 1, and 2
		if (choice == 0) {
			System.out.println("You chose YES");
		}
		else if (choice == 1) {
			System.out.println("You chose NO");
		}
		else if (choice == 2) {
			System.out.println("You chose CANCEL");
		}
		
		//An alternative way to check the choice using the
		//built in JOptionPane constants
		if (choice == JOptionPane.YES_OPTION) {
			System.out.println("You chose YES");
		}
		else if (choice == JOptionPane.NO_OPTION) {
			System.out.println("You chose NO");
		}
		else if (choice == JOptionPane.CANCEL_OPTION) {
			System.out.println("You chose CANCEL");
		}	
		else if (choice == JOptionPane.ERROR_MESSAGE) {
			System.out.println("Closed");
		}
		
		System.out.println(choice);
	}

}
