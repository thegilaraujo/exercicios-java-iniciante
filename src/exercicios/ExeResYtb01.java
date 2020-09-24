/* Fazer um programa para ler as medidas da largura e comprimento de um terreno
 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
 * com duas casa decimais. Em seguida, o programa deve mostrar o valor da área do
 * terreno, bem como o valor do preço do terreno, ambos com duas casa decimais,
 * conforme exemplo:
 * */

/*ÁREA = LARGURA X COMPRIMENTO
 * 
 * PRECO = ÁREA X PREÇO DO METRO QUADRADO
 * */

package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class ExeResYtb01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		double valorMetroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * valorMetroQuadrado;
		
		System.out.println("\n.:: VALORES!!! ::.\n");
		System.out.printf("A largura do terreno digitado foi: %.1f%n", largura);
		System.out.printf("O comprimento do terreno digitado foi: %.1f%n", comprimento);
		System.out.printf("O valor do metro quadrado do terreno digitado foi: %.1f%n", valorMetroQuadrado);
		System.out.printf("O valor da área do terreno é: %.2f mts²%n", area);
		System.out.printf("O valor do terreno baseado no metro quadrado é: R$%.2f%n", preco);
		sc.close();
	}

}
