package Sample;

public class Star_Pattern {
	public static void main(String[] args) {
		int i, j;
		// outer loop to handle number of rows
		for (i = 1; i <= 6; i++) {
			// inner loop to print space
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			// print new line for each row
			System.out.println();
		}
	}
}