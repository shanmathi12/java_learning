package assignments;

public class ReversePyramidPattern {

	static void reversedStar(int num) {

			for (int i = 0; i <= num; i++) {

				for (int j = 0; j < i; j++) {

					System.out.print(" ");
				}

				for (int j = i + 1; j <= num; j++) {

					System.out.print("* ");
				}

				System.out.println();
			}
		}
	  
	  public static void main(String[] args) {

			reversedStar(5);
	    
	  }
}
	  
