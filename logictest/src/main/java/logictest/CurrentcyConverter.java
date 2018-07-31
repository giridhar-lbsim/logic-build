package logictest;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

enum Currency {
	
	US(68.41), FRANCE(79.98), CHINA(10.20);
	
	private double currency;

	private Currency(double cur) {
		this.currency = cur;
	}
	public double getCurrencyRate() {
		return currency;
	}
}

public class CurrentcyConverter {

	/**
	 * @param payment
	 */
	public static void convertCurrency(double payment) {
		
		// Write your code here.
        /*NumberFormat localFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + localFormat.format(payment));
        
        localFormat = NumberFormat.getPercentInstance(new Locale("en","in"));
        System.out.println("India: " + localFormat.format(payment));
        
        localFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + localFormat.format(payment));
		
        localFormat = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        System.out.println("France: " + localFormat.format(payment));*/
        
        
        Locale uslocale = new Locale.Builder().setLanguage("en").setRegion("US").build(); 
        Locale inlocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale chlocale = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
        Locale frlocale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();

        NumberFormat usformat = NumberFormat.getCurrencyInstance(uslocale);
        NumberFormat informat = NumberFormat.getCurrencyInstance(inlocale);
            NumberFormat chformat=NumberFormat.getCurrencyInstance(chlocale);
            NumberFormat frformat=NumberFormat.getCurrencyInstance(frlocale);
        
            System.out.println("US: " + usformat.format(payment));
            
            System.out.println("India: " + informat.format(payment));
            
            System.out.println("China: " + chformat.format(payment));
    		
            System.out.println("France: " + frformat.format(payment));
            
        
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double payment = in.nextDouble();
		convertCurrency(payment);

	}

}
