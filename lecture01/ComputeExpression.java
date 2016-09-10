/*
	Shows that you can also print the result of an expression.
	Java will solve the computation first and then print the answer.
	NOTE: The difference between lines 9 and 10.
*/

public class ComputeExpression {
	public static void main(String[] args) {
		System.out.println("(10.5 + 2 * 3) / (45 – 3.5)"); //Prints the literal expression
		System.out.println((10.5 + 2 * 3) / (45 – 3.5)); //Prints the solution.
	}
}