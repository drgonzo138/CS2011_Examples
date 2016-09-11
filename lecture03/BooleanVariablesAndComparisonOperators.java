public class BooleanVariablesAndComparisonOperators {
	public static void main(String[] args) {
		//Create a boolean variable holding a value of false
		boolean isValid = false;
		
		//Boolean comparison results can also be assigned to variables
		boolean isGreaterThan = 5 > 2;

		//Boolean comparison results can also be directly printed to the console
		//Note the use of the inner parantheses otherwise you will get a compile error
		System.out.println("10 == 10 is " + (10 == 10));
		
		//Print the previous two variables
		System.out.println("isValid = " + isValid);
		System.out.println("isGreaterThan = " + isGreaterThan);
	}
}