import java.util.Scanner;

public class ArrayExamples {

	public static void main(String[] args) {
		//An array with an initializer list.
		int[] a = {1, 2, 3, 4, 5};
		
		//An array with 10 double values.
		//Automatically initialized to 0.0, does not
		//have other values yet.
		double[] b = new double[10];
		
		int[] c = initArray();
	}
	
	//Returning an array from a method.
	//Here we initialize the array with user input.
	public static int[] initArray() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many values do you want to enter: ");
		int numberOfValues = in.nextInt();
		
		//My array size will by 7
		int[] arr = new int[numberOfValues];		

		System.out.println("Enter " + arr.length + " values: ");
		
		for (int index = 0 ; index < arr.length ; index++) {
			arr[index] = in.nextInt();
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		/* Using a regular for loop*/
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}		
	}
}