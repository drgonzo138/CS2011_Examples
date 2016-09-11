import java.util.Random; //<-- Don't forget to import

public class RandomNumberGeneration2 {
	public static void main(String[] args) {
		Random r = new Random(); //<-- create your random object.

		// You can generate any range of random numbers [min, max] using the following
		// formula:
		// r.nextInt((max – min) + 1) + min;

		//Generate a random number between 2 and 10 including the 10;
		int randomInt = r.nextInt((10 - 2) + 1) + 2;
		
		//Generate a random number between 72 and 107
		randomInt = r.nextInt((107 - 72) + 1) + 72;
	}
}
