package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int marks[][] = {
				{45, 56, 76, 90, 32},
				{77, 78, 34, 88, 99},
				{56, 68, 88, 90, 53}}; 
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(marks[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
