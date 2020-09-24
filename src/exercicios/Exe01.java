/* Exercicio 01.
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
 * com uma mensagem explicativa.
 */

package exercicios;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		int a, b;

		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o valor de A: ");
		a = sc.nextInt();
		System.out.printf("Digite o valor de B: ");
		b = sc.nextInt();

		System.out.println("A soma de A + B é igual à: " + (a + b));

		sc.close();
	}

}
