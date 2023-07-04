package programs;

public class FindDuplicateCharinaString {

	public static void main(String[] args) {
		
		String s = "STTU";
		
		char b[] = s.toCharArray();
		System.out.println("The string is:" + s);
		System.out.print("Duplicate characters in a given string: ");
		
		for(int i=0; i<s.length(); i++) 
			{	
			for(int j=i+1; j<s.length(); j++) {
				if(b[i]== b[j]) {
					System.out.println(b[i]);
					break;
				}
			}
		}
		
	}

}
