package Lab1.Day3.Assignment2;

public class TwoD {
	public static void main(String args[]) {
		int farray[][]= {{1,1,1},{1,1,1}};
		int sarray[][]= {{2,2,2},{2,2,2}};
		System.out.println("Contents of first array");
		for(int i =0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(farray[i][j]);
			}
			System.out.println();
		}
		System.out.println("Contents of second array");
		for(int i =0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(sarray[i][j]);
			}
			System.out.println();
		}
	}
}
