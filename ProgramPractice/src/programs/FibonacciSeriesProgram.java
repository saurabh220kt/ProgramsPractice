package programs;

public class FibonacciSeriesProgram {

	//Fibonacci series - 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
	public static void main(String[] args) {
		int num = 9;
		int p=1, q=1,t;
		
		System.out.print(p);  //1st term
		System.out.print(q);  //2nd term
		
		for(int i = 3; i<=num; i++ ) {
			
			t= p+q;
			System.out.print(t);			//3rd number
		
			p=q;
			q=t;
	}	
	}
}
