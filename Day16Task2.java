package Module1;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class AdditionalFeatures {
    public static void main(String[] args) {
//       Date now = new Date();
//       while(true) {
//    	   SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");  // format: hour:minute:second AM/PM
//           String formattedTime = timeFormat.format(now);
//           System.out.println("Time: " + formattedTime);
//       }
    	
//    		Locale india = new Locale("en", "IN");
//
//        // Language and country
//        System.out.println("Language: " + india.getDisplayLanguage());
//        System.out.println("Country: " + india.getDisplayCountry());
//
//        // Country code
//        System.out.println("Country Code: " + india.getCountry());
//
//        // Currency
//        Currency currency = Currency.getInstance(india);
    	
//        System.out.println("Currency: " + currency.getCurrencyCode());
    	
//    		Date today = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();  // format: day-month-year
//        String formattedDate = sdf.format(today);
//        System.out.println("Date: " + formattedDate);
    	
    		double amount=652778880;
		Locale i=new Locale("en","IN");
		NumberFormat f=NumberFormat.getCurrencyInstance(i);
		System.out.println(f.format(amount));



    }
}
