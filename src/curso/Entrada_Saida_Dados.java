package curso;

import java.util.Scanner;
import java.util.Locale;

public class Entrada_Saida_Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	// USANDO ESSE PARAMETRO VOCÊ DEVE DIGITAR USANDO O . PARA GRAVAR OS DADOS!
		
		Scanner sc = new Scanner(System.in);
		
		String name, lastName;
		int numberBedRooms;
		double productPrice;
		
		System.out.print("Enter your full name: ");	// LER NOME COMPLETO DA PESSOA!
		name = sc.nextLine(); // RECEBER OS DADOS DA PESSOA (NOME)
		System.out.print("How many bedrooms are there in your house?: ");	// SABER QUANTOS BANHEIROS TEM NA SUA CASA.
		numberBedRooms = sc.nextInt();
		System.out.print("Enter product price: ");	// QUANTO CUSTOU.
		productPrice = sc.nextDouble();
		System.out.print("Enter your last name, age and height (same line): ");
		lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println("=================================");
		System.out.println(" Your name: " + name);
		System.out.println(" Number Bedrooms: " + numberBedRooms);
		System.out.printf(" Product price: $ %.2f ", productPrice);
		System.out.println("\n Lastname: " + lastName);
		System.out.println(" Age: " + age);
		System.out.println(" Height: " + height);
		System.out.println("=================================");
		
		sc.close();
	}

}
