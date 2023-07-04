package programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatefromArrayList {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<String>();
		a.add("Apple");
		a.add("Babaji");
		a.add("Babaji");
		a.add("Mangoes");
		System.out.println(a.toString());
		
		Set<String> res = new LinkedHashSet<String>(a);
		
		System.out.println(res);
	}

}
