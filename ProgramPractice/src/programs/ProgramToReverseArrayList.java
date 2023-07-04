package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramToReverseArrayList {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<String>();
		a.add("Baba");
		a.add("Ji");
		
		System.out.println("Before reversing");
		System.out.println(a.toString());
		
		Collections.reverse(a);
		System.out.println("After reversing");
		System.out.println(a.toString());
	}
	

}
