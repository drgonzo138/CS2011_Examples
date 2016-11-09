
public class ArrayDefaultValues {
	public static void main(String[] args) {
		//Create an integer array with default values
		int[] intArray = new int[5];
		
		//Create a double array with default values
		double[] doubleArray = new double[5];
		
		//Create a boolean array with default values
		boolean[] booleanArray = new boolean[5];
		
		//Create a string array with default values
		String[] stringArray = new String[5];
		
		//Create a char array with default values
		char[] charArray = new char[5];
		
		System.out.print("The values in the int array are: ");
		printArray(intArray);
		System.out.print("\nThe values in the double array are: ");
		printArray(doubleArray);
		System.out.print("\nThe values in the boolean array are: ");
		printArray(booleanArray);
		System.out.print("\nThe values in the String array are: ");
		printArray(stringArray);
		System.out.print("\nThe values in the char array are: ");
		printArray(charArray);
		
		
	}
	
	public static void printArray(int[] array) {
		for (int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void printArray(double[] array) {
		for (int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void printArray(boolean[] array) {
		for (int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void printArray(String[] array) {
		for (int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void printArray(char[] array) {
		for (int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i]);
		}
	}

}
