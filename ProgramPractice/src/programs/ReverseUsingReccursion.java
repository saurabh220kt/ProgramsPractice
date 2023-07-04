package programs;

public class ReverseUsingReccursion {

	public static void main(String[] args) {
		/* String s = "I Love India";
		
		 String res = "";
		int num = s.length()-1;
		for(int i=num; i>=0; i--) {  //i=0
				   		
				res = res + s.charAt(i);
		 
		}
			System.out.println(res); */
		
		String s1= "Saurabh";
		StringBuffer res = new StringBuffer(s1);
	
		
		System.out.println(res.reverse());
	} 

}

