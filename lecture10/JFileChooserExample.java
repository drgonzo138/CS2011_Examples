import java.io.File;

import javax.swing.JFileChooser;

public class JFileChooserExample {

	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser();
		
		//This will display the JFileChooser dialog box and all the user
		//to choose a file.
		//We want to store the int returned so we can make a decision based on that.
		int jfcUserOption = jfc.showOpenDialog(null);
		
		//Option for when the user correctly chose the file
		if (jfcUserOption == JFileChooser.APPROVE_OPTION) {
			File chosenFile = jfc.getSelectedFile();
			System.out.println("The file you chose was: " + chosenFile.getName());
		}
		//option if the user chose the cancel button
		else if(jfcUserOption == JFileChooser.CANCEL_OPTION) {
			System.out.println("You chose cancel");
		}
		//option if there was some kind of error
		else if (jfcUserOption == JFileChooser.ERROR_OPTION) {
			System.out.println("There was some error!");
		}
	}
}
