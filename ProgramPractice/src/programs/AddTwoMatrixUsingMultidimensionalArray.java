package programs;

import java.util.ArrayList;

public class AddTwoMatrixUsingMultidimensionalArray {

	public static void main(String[] args) {
		int[][]a = {{1,2,3},{4,5,6},{3,7,3}};
		int[][]b = {{1,2,3},{4,5,6},{3,7,3}};
		
		int sum = 0; 
		ArrayList<Integer> sumList = new ArrayList<>();
		
			for(int i=0;i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				 sum = a[i][j] + b[i][j];
				sumList.add(sum);
			}
			}
			for(Integer num : sumList) {
				System.out.println(num);
			}
	}	
	}



