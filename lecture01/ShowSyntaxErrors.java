/** 
 * Demonstrates Syntax Errors.
 * The keyword void is missing in the main method header. 
 * The closing double quote " is also missing.
 * Compile to see errors.
 */

public class ShowSyntaxErrors {
	//           |--------------------Missing the keyword static 
	//           v
	public static main(String[] args) {
		System.out.println("Welcome to Java); //<--Missing closing quote.
	}	
}