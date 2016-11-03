import javax.swing.JOptionPane;

public class JOptionPaneDisplayMessage {
	public static void main(String[] args) {
		//JOptionPane Information message
		String title = "Information Message";
		String message = "This is an information message.";
	
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
		
		//JOptionPane Error message
		String title2 = "Error Message";
		String message2 = "This is an error message.";
		
		JOptionPane.showMessageDialog(null, message2, title2, JOptionPane.ERROR_MESSAGE);
				
		
		//JOptionPane Warning message
		String title3 = "Warning Message";
		String message3 = "This is a warning message.";
				
		JOptionPane.showMessageDialog(null, message3, title3, JOptionPane.WARNING_MESSAGE);
						
		//JOptionPane Question message
		String title4 = "Question Message";
		String message4 = "This is a question message.";
						
		JOptionPane.showMessageDialog(null, message4, title4, JOptionPane.QUESTION_MESSAGE);
						
		//JOptionPane Plain message
		String title5 = "Plain Message";
		String message5 = "This is a plain message.";
								
		JOptionPane.showMessageDialog(null, message5, title5, JOptionPane.PLAIN_MESSAGE);			
	}
}
