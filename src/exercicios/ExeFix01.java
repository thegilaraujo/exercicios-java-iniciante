/*Em um novo programa, inicie as seguintes variaveis:
 * Em seguida, usando os valores das vari�veis, produza
 * a seguinte s�ida na tela do console:*/

package exercicios;

import java.util.Locale;

public class ExeFix01 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30; int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		System.out.printf("%d years old, code %d and gender: %c%n%n", age, code, gender);
		System.out.printf("Measure with decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US); // Usar . ao inves de ,
		System.out.printf("US decimal point: %.3f", measure);
	}

}
