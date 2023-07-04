package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharFromString {

	 public static  void removeDuplicate(String str) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();  //Create LinkedHashSet of type character   
		
		for(int i=0; i<str.length(); i++) {   //Add each character of the string into LinkedHashSet   
			set.add(str.charAt(i));
		}
		for(Character ch : set) {  // print the string after removing duplicate characters   
			System.out.print(ch);
		}
		}
	 
	 public static  void main(String args[]){
		{
			String str = "javaTpoint is the best learning website";   
			 removeDuplicate(str);   ////removeDuplicates() method by passing the string as an argument   
			
		}
	  
}
}