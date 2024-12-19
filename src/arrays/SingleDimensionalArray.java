package arrays;

public class SingleDimensionalArray {
	
	public static void main(String[] args) {
		// Declaring an array
		int[] marks;
		marks = new int[5];
		// OR
		int[] marks1 = new int[5];
		
		//Initializing an array
		int[] marks2 = new int[] {20, 30, 34, 50, 56};
		
		//Declare and assign
		int[] marks3 = new int[5];
		marks3[0] = 100;
		marks3[1] = 66;
		marks3[2] = 80;
		marks3[3] = 50;
		marks3[4] = 90;
		
	
		for(int i = 0; i < marks3.length; i++) {
//			int j = marks3[i];
			System.out.println(marks3[i]);
		}
		
		System.out.println("**********************");
		
		// For Each Loop
		for (int value : marks3) {
			System.out.println(value);
		}
	}

}
