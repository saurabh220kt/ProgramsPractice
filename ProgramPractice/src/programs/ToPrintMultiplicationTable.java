package programs;

import java.util.Scanner;

public class ToPrintMultiplicationTable {

	public static void main(String[] args) {
	
		//int num1=1;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter any number you wish to print table");
		 int num = a.nextInt();
		  for(int i=1; i<=10; i++) {
			  
			 System.out.println(num + " * " + i + " = " + (num*i));
	}

}
}
