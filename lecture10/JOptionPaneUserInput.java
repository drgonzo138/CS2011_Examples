import javax.swing.JOptionPane;

public class JOptionPaneUserInput {
	public static void main(String[] args) {
		String title = "String Input";
		String message = "Enter a string";
		
		//Use JOptionPane to get a string
		String string = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
		
		
		String title2 = "Integer Input";
		String message2 = "Enter an integer";
		
		//Use JOptionPane to get a string
		String intString = JOptionPane.showInputDialog(null, message2, title2, JOptionPane.QUESTION_MESSAGE);
		
		//Convert the string into an integer
		int convertedInt = Integer.parseInt(intString);
		
		
		String title3 = "Double Input";
		String message3 = "Enter a double";
		
		//Use JOptionPane to get a string
		String doubleString = JOptionPane.showInputDialog(null, message3, title3, JOptionPane.QUESTION_MESSAGE);
		
		//Convert the string into an integer
		double convertedDouble = Double.parseDouble(doubleString);
		
	
		System.out.println("The string you entered was: " + string);
		System.out.println("The integer you entered was: " + convertedInt);
		System.out.println("The double you entered was: " + convertedDouble);
	}
}
