package programs;

public class CheckLeapYearOrNot {

	public static void main(String[] args) {
		//A leap year is exactly divisible by 4 except for century years (years ending with 00). 
		//The century year is a leap year only if it is perfectly divisible by 400.
		
		int a = 1000;
		if((a%400==0) || (a%4==0) && (a%100!=0)) {
			System.out.println(a + ": is a leap year");
		}else {
			System.out.println(a + ": is NOT a leap year");
		}
	}

}
