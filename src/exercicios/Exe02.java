/* Faca um programa para ler o valor do raio de um circulo, e depois mostrar o valor da área deste
 * circulo com quatro casa decimais conforme exemplos:
*/
package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exe02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double raio, area, pi = 3.14159;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		raio = s.nextDouble();
		
		area = pi * raio*2;
		
		System.out.printf("O valor da área é igual à: %.4f", area);
		
		s.close();
	}

}
