import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyingFiles {
	public static void main(String[] args) {
		//Create our file object.
		File inFile = new File("stopping.txt");
		
		//Check to see if the file exists.
		if (!inFile.exists()) {
			System.err.println("Input File does not exist!");
			System.exit(1);
		}
		
		//Create the output file.
		File outFile = new File("copy.txt");
		
		//Create our input and output streams
		Scanner in = null;
		PrintWriter out = null; 
		
		try {
			in = new Scanner(inFile);
			out = new PrintWriter(outFile);
		}
		catch (FileNotFoundException ex) {
			
		}
		
		//Read each line and send it to the output file.
		while(in.hasNext()) {
			out.println(in.nextLine());
		}
		
		System.out.println("File copied successfully!");

		in.close();
		out.close();
	}
}