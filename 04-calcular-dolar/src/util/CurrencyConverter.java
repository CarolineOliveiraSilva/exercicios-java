package util;

public class CurrencyConverter {
	
	
	
		public static final double IOF = 0.06;
		
		public static double valorreal(double quantity , double dollar ) {
			
			return (quantity * dollar) * (1+ IOF);
		}
		
}