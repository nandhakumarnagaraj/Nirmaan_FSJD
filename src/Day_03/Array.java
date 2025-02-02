package Day_03;

public class Array {
	public static void main(String[] args) {
		int[][] age = new int[3][3];
		age[0][0] = 2;
		age[2][2] = 2;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print( age[i][j]);
			}
			System.out.println();
		}
	}
}
