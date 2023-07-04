package programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {
		
		String str = "19/05/2023";
		
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(str);
		
		System.out.println(date);
		
	}

}
