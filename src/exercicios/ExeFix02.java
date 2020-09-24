/*fazer um programa para executar o seguinte procedimento
 * de entrada de dados, e depois mostrar os dados na tela:*/
package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExeFix02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// VARIAVEIS
		String name, lastName;
		int bedRooms, age;
		double productPrice, height;

		// ENTRADA DE DADOS
		System.out.println("Enter your full name: ");
		name = sc.nextLine();
		System.out.println("Hpw many bedrooms are there in your house?: ");
		bedRooms = sc.nextInt();
		System.out.println("Enter product price: ");
		productPrice = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line): ");
		lastName = sc.next();
		age = sc.nextInt();
		height = sc.nextDouble();

		System.out.println("\n.:: SAÍDA DE DADOS ::.\n");
		System.out.println("Full name: " + name);
		System.out.println("Number BedRooms: " + bedRooms);
		System.out.printf("Product Price: $%.2f%n", productPrice);
		System.out.println("Last name: " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);

		sc.close();

	}

}
