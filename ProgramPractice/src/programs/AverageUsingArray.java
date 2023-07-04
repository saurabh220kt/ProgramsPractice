package programs;

public class AverageUsingArray {

	public static void main(String[] args) {
		
		int i[] = {1,2,35,6,67};
		double num = 0;
		
		for(double x:i) 
		{
			num = num + x;
		}
		double average = num / i.length;
        System.out.format("The average is: %.2f", average);

	}

}
