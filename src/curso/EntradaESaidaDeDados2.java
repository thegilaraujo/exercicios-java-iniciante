package curso;

import java.util.Scanner;
import java.util.Locale;

public class EntradaESaidaDeDados2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); //35
		sc.nextLine();
		String name = sc.nextLine(); // Gildevan Araujo Bomfim
		char gender = sc.next().charAt(0); // F
		String s = sc.next(); //b
		char letter = s.charAt(0);	// Armazenar na variável a PRIMEIRA letra digitada na variável s.
		int digit = Integer.parseInt(s.substring(1));	//5
		double n2 = sc.nextDouble();
		String name2 = sc.next(); 
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
				
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		sc.close();
	}

}
