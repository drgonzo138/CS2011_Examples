import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileInputWithScanner {
	public static void main(String[] args) {
	                                                                        
		//Create our input file object                                    
		File inFile = new File("input_data.txt");     
		
		//Create the input stream.
		Scanner in = null;
		try {
			in = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("File not found! Program will now exit!");
			System.exit(1);
		}
		
		//Read each value in the text file and print it out.
		while(in.hasNext()) {
			int data = in.nextInt(); //I am reading int type so need to use nextInt()
			System.out.println(data);
		}
	}
}