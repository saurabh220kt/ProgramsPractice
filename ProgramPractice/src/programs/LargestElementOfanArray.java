package programs;

public class LargestElementOfanArray {

	public static void main(String[] args) {
		
		int[] a = {10,1000,500, 800, 3222};
		int min=a[0];

		for(int i=0; i<a.length; i++) {
			
			if(a[i]<min) {
				min = a[i];
				}
				}
				System.out.println("Minimum element: "+ min);
					
				}
}


				
				
				
		



