package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPractice {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Baba");
		a.add("Ji");
		a.add("Apple");
		a.add("Motorola");
		
		Iterator<String> b = a.iterator();
		
		while(b.hasNext()) {  //true
			System.out.println(b.next());  //Baba ji Apple Motorola
		}
		
		
		}
		
	}


