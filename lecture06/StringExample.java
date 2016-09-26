import java.util.Scanner;


public class StringExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int i = in.nextInt();
		
		in.nextLine();
		
		System.out.print("Enter a String: ");
		String s = in.nextLine();
		
		System.out.println("i is: " + i);
		System.out.println("s is: " + s);
		
		System.out.println("End of program");
	}

}
