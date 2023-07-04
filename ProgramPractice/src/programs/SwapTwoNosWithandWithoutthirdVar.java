package programs;

public class SwapTwoNosWithandWithoutthirdVar {

	public static void main(String[] args) {
		//Swap 2 no with 3rd var
		
	/*	int a=1, b=2, res;
		res=a;
		a=b;
		b=res;
		
		System.out.println(a);
		System.out.println(b);   */
		
		//Swap 2 no without 3rd var
		int a=1, b=2;
		
		a= a+b;  //a=3 (1+2)
		b= a-b;  //b=1 (3-2)
		a= a-b; 	 //a=2
		
		System.out.println(a);
		System.out.println(b);
	}

}
