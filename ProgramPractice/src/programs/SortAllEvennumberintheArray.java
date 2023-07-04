package programs;

import java.util.ArrayList;
import java.util.Collections;

public class SortAllEvennumberintheArray {

	public static void main(String[] args) {
		int[] a = {2,3,34,22,5,32,21,56};
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
		if(a[i]%2==0) {
				b.add(a[i]);
		}
		}
		Collections.sort(b);
		for(int test : b) {
			System.out.print(test + ",");
		}			
		}
		}
		
	


