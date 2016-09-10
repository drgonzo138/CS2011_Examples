/* -Shows how to use comments to outline your program.
*/

public class ComputeArea {
	public static void main(String[] args) {
		double radius; // Declare radius
		double area; // Declare area
		
		// Assign a radius
		radius = 20; // radius is now 20

		// Compute area
		area = radius * radius * Math.PI;
	
		// Display results
		System.out.println("The area for the circle of radius " +
			radius + " is " + area);
	}
}