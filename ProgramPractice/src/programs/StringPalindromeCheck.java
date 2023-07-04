package programs;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		
		//Palindrome is 1331, 121 ...
	
		String str = "abcdcba";
		int i=0, j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) 
				{
					System.out.println(str+ " is not a palindrome number");
					System.exit(0);			
				}
					i++;
					j--;	
				}
					System.out.println(str+ " is palindorme number");
	 }
}
