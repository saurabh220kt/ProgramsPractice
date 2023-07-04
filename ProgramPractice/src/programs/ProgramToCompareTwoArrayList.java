package programs;

import java.util.ArrayList;
import java.util.List;

public class ProgramToCompareTwoArrayList {

	public static void main(String[] args) {
		
		
		List<String> a = new ArrayList<String>();
		a.add("Apple");
		a.add("Apple");
		a.add("Banana");

		List<String> b = new ArrayList<String>();
		b.add("Apple");
		b.add("Banana");
		
		boolean res1 = a.equals(b);
		
		System.out.println(res1);
		}
		
		
	}

