package first;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion_date {

	public static void main(String[] args) throws ParseException {
		
		String dob1= "18/10/1979";
		SimpleDateFormat sd1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = sd1.parse(dob1);
		System.out.println(date1);
        String day1 = new SimpleDateFormat("d").format(date1);
		String month1 = new SimpleDateFormat("MMM").format(date1);
		int year1 = Integer.parseInt(new SimpleDateFormat("YYYY").format(date1));
		System.out.println("The date of Birth is "+day1+"th of"+month1+year1);
		String dob="24/04/1955";
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sd.parse(dob);
		System.out.println(date);
		String month =  new SimpleDateFormat("MMM").format(date);
		int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(date));
		String day = new SimpleDateFormat("d").format(date);
		System.out.println(day+" - "+ month+" - "+year );

	}

}
