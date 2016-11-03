import java.io.File;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) {
		
		//Create a file object with a file in the current working directory.
		File myFile = new File("input_data.txt");
		
		//Demonstrates some methods of the file class.
		System.out.println("File exists?:\t\t" + myFile.exists());
		System.out.println("Absolute Path:\t\t" + myFile.getAbsolutePath());
		System.out.println("File Name:\t\t" + myFile.getName());
		System.out.println("File Size:\t\t" + myFile.length() + " bytes");
		System.out.println("Is this a directory?:\t" + myFile.isDirectory());
		System.out.println("Is this a file?:\t" + myFile.isFile());
		System.out.println("Last Modified:\t\t" + new Date(myFile.lastModified()));
	}
}