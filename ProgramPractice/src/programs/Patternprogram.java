package programs;

public class Patternprogram {

		//pattern program
	public static void main(String[] arg){       	 
		  
		int number;
		//loop for rows  
		for(int i=0; i<8; i++)  
		{   
		number=1;   
		//loop for columns  
		for(int j=0; j<=i; j++)  
		{   
		//prints num  
		System.out.print(number+ " ");   
		//incrementing the value of number   
		number++;   
		}   
		//throws the cursor at the next line after printing each row  
		System.out.println();   
		}   
		}   
		}  