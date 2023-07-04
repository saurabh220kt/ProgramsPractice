package programs;

public class StringPalindrome {

	public static void main(String[] args) {

			String str = "ABCD";
			int i=0;
			int j= str.length()-1;
			boolean b = true;
			
			while(i<j) {
				if(str.charAt(i)!=str.charAt(j)) {
					b= false;
					break;
				}
				i++;
				j--;
			}
			if(b) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not a Palindrome");
			}

	}
}
				
		

