package programs;

public class AvgUsingArray {

	public static void main(String[] args) {
		//Avg using array

		double []a = {2,43,12,43,90};
		double num=0,res;
		for(double x : a) {
			
			num = num + x;
		}
		
		res = num/a.length;
		
		System.out.format("The average is: %.2f", res);
	}
		
		
	}


