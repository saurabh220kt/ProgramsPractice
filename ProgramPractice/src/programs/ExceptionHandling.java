package programs;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		/*try {
			int[] a = new int[2];
			a[1] = 5/0;
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Handled");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound Exception Handled");
		}
				*/
		
		int age = 5;
		try {

		if(age<6) {
			throw new Exception("you are not eligible");
		}
		}
			catch(Exception e) {
		
			System.out.println(e.getClass());	
		}
		if(age>=6) {
			System.out.println("You are eligible");
		}
}
}