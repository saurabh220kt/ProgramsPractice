package programs;

public class ArrayContainsGivenValueOrNot {

	public static void main(String[] args) {
		
		int[] a = {21,2,9,98, 80};
		int num = 860;
		boolean res = false;
		
		for(int test:a) {
			if(test==num) {
				res = true;
			}
			}
		if(res) {
			System.out.println("Array Contains Given Value");
		}
		else {
			System.out.println("Array doesn't Contains Given Value");
		}
			}
		}
	


