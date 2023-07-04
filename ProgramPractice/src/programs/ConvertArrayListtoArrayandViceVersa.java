package programs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListtoArrayandViceVersa {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Baba");
		a.add("Ji");
		a.add("Chuisam");
		
		System.out.println(a.toString());
		
		String b[] = new String[a.size()];
		a.toArray(b);
		System.out.print("Array is: ");
		
		for(String test : a) {
			System.out.print(test+" ");
		}
		
		System.out.println();
		System.out.println("Converting Array to ArrayList");
		String[] d = {"Baba", "Ji"};
		List<String> v1 = new ArrayList<>(Arrays.asList(d));
		
		System.out.println(v1);
		
	}

}
