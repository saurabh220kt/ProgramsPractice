package programs;

public class OddandEvenProgram {

	public static void main(String[] args) {
		
		//Odd: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27
		//Even: 2,4,6,8...
		//Print first 100 even number and odd number
		
		for(int num=1; num<=100; num++){
			if(num%2!=0) 
			{
				System.out.println(num);
			}
		
		}
	}
}
	
