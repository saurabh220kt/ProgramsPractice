package programs;

import java.util.Scanner;

public class PirmeOrNotProgram {

	public static void main(String[] args) {
		// to check prime - 1st put condition for 2 and then rest of the code
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = in.nextInt();
		int num=0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				num++;
			}
			}
		if(num==2) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		
		}
	}
}

/*
public class A {

	public static void main(String[] args) {
		
	int num=2;
	boolean test = false;
	if(num==2) {
		System.out.println("Prime no");
	}else {
		
	for(int i=2; i<num; i++) {
		
		if(num%i==0) {
		test = true;
		break;
		}
	}
	if(test==false) {
		System.out.println("no is prime");
	}else {
		System.out.println("not a prime");
	}
	}
}
} */

