
public class RandomNumberGeneration1 {
	public static void main(String[] args) {

		// You can generate any range of random numbers [min, max] using the following
		// formula:
		// min + (int)(Math.random() * ((max - min) + 1));

		//Generate a random number between 2 and 10 including the 10;
		int randomInt = 2 + (int)(Math.random() * ((10 - 2) + 1));
		
		//Generate a random number between 72 and 107
		randomInt = 72 + (int)(Math.random() + ((107 - 72) + 1));
	}
}
