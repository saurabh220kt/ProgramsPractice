package programs;

import java.util.ArrayList;
import java.util.List;

public class ProgramtoJoinTwoList {

	public static void main(String[] args) {
		
			List<String> a = new ArrayList<>();
			a.add("Baba");
			a.add("Ji");
			
			List<String> b = new ArrayList<>();
			b.add("Chuisam");
			b.add("Maharaj");
			
			List<String> res = new ArrayList<>();
			res.addAll(a);
			res.addAll(b);
			
			System.out.println("Joined List: " + res);

	}

}
