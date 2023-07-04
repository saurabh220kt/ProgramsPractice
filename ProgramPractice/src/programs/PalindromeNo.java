package programs;

		public class PalindromeNo {

			
		public static void main(String[] args) {  // palindrome no or not
		
			int num = 121, rem=0, rev = 0;
			int t=num;

			while(num>0) {
			
				rem = num%10;  //2
				rev = rev*10 + rem;  //12
				num = num/10;    //12
			}
		if(t==rev) {
					System.out.println("no is palindorme");		
		}else {
			System.out.println("no is not palindrome");
		}
		}
		}
		

	
	
	