package programs;

import java.util.Arrays;

public class ProgramtoconvertCharToStringandViceversa {

		public static void main(String[] args) {
		
			//char to string
			char[] a = {'a','b','c'};		
			String d = String.valueOf(a);
			System.out.println(d);  

		//string to char
			String test ="abc love";

			char[] res = test.toCharArray();;
			System.out.println(Arrays.toString(res));
	}

}
