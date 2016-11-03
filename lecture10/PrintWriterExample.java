import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class PrintWriterExample {

	public static void main(String[] args) {
		//Create our File object for the file we want to read
		File outFile = new File("output_data.txt");

		//Test to make sure the file actually exists before doing
		//anything else.
		if (!outFile.exists()) {
			System.out.println("File not found!");
			System.exit(1);
		}

		//Create the PrintWriter object
		//I have to surround the PrintWriter with a try/catch.
		PrintWriter pw = null;
				
		try {
			pw = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			System.out.println("Output file not found! Program will now exit!");
			System.exit(1);
		}

		//write some text to our file
		pw.println("This is my first line of text.");
		pw.println("This is my second line of text.");

		//Don't forget to close, or your output may not show up
		pw.close();

	}
}
