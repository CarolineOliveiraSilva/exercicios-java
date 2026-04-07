package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Valor_dolar {

public static  void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolár? " );
		double dollar = sc.nextDouble();
		
		System.out.print("Quantos  dolár você vai comprar? " );
		double quantity = sc.nextDouble();
		
		System.out.printf("Valor em reias =  %.2f%n ", CurrencyConverter.valorreal(quantity, dollar));
		
		sc.close();
		
}


}
