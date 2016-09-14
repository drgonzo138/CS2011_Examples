public class Lec04Examples {
	public static void main(String[] args) {
		
		int x = 10;
		int y;

		y = (x > 0) ? 1 : -1;

		if (x % 2 == 0) {
			System.out.println("x is even");
		}
		else {
			System.out.println("x is odd");
		}

		System.out.println("x is " + ((x % 2 == 0) ? "even" : "odd"));
		System.out.println("NEW LINE!!!");
		if (x > 0) {
			y = 1;
		}
		else if (x == 0) {
			y = 0;
		}
		else {
			y = -1;
		}

		y = (x > 0) ? 1 : ((x == 0) ? 0 : -1);




		// int choice = 6;

		// //final int CASE_1 = 7;

		// switch (choice) {
		// 	case 7: System.out.println("A"); break;
		// 	case 1: System.out.println("B"); break;
		// 	case 1000: System.out.println("C"); break;
		// 	default: System.out.println("D");
		// }




	}
}