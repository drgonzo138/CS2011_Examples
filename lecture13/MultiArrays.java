import java.util.Random;

public class MultiArrays {

	public static void main(String[] args) {
		int[][] table = initRandomData(5, 10);
		
		printTable(table);
		System.out.println("sum of table is: " + sumArray(table));
	
	}
	
	public static int sumArray(int[][] arr) {
		int sum = 0;
		
		for (int row = 0 ; row < arr.length ; row++) {
			for (int col = 0 ; col < arr[row].length ; col++) {
				sum += arr[row][col];
			}
		}
		
		return sum;
	}
	
	public static int[][] initRandomData(int numRows, int numCols) {
		int[][] result = new int[numRows][numCols];
		
		Random r = new Random();
		
		for (int row = 0 ; row < result.length ; row++) {
			for (int col = 0 ; col < result[row].length ; col++) {
				result[row][col] = r.nextInt(10);
			}
		}
		
		return result;
		
	}
	
	
	public static void printTable(int[][] arr) {
		for (int row = 0 ; row < arr.length ; row++) {
			for (int col = 0 ; col < arr[row].length ; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}