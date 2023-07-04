package programs;

public class Pattern {

	public static void main(String[] args) {
		int num = 3;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				for(int k=0;k<j;k++) {
					System.out.print(j-1);
				}
			}
			
			System.out.println();
		}

	}

}
