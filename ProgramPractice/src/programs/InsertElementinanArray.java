package programs;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertElementinanArray {

	public static void main(String[] args) {
		
		Integer[] a = {1,2,3,4};
		
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(a));
		
		System.out.println("Array:"+ Arrays.toString(a)); 
			b.add(9);
			a = b.toArray(a);
			System.out.println("Array after adding element: "+ Arrays.toString(a));  
		  
		}  		
		}
		


