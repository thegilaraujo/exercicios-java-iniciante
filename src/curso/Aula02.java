package curso;

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um n�mero: ");
		n = sc.nextInt();
		
		System.out.println("O n�mero antecessor de " + n + " �: " + (n - 1));

		sc.close();
	}

}
