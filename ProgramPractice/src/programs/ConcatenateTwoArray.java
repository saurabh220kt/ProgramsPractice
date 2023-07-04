package programs;

import java.util.Arrays;

public class ConcatenateTwoArray {

	public static void main(String[] args) {
		
		
// we have created two integer arrays firstArray and secondArray. 
		//In order to merge two arrays, we find its length and stored in fal and sal variable respectively. 
		//After that, we create a new integer array result which stores the sum of length of both arrays. 
		//Now, copy each elements of both arrays to the result array by using arraycopy() function.
		
		int[]a= {1,2,3};
		int[]b= {4,5,6};
		
		int[] res = new int[a.length + b.length];
		System.arraycopy(a, 0, res, 0, a.length);
		System.arraycopy(b, 0, res, a.length, b.length);
		
		System.out.println(Arrays.toString(res));
	}

}
