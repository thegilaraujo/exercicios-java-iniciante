package curso;

public class Aula01 {

	public static void main(String[] args) {
		
		int b = 2;
		int c = 3;
		int x = 2;
		int y = 10;
		
		int i = (((10*8)+3)+9);
		int j = ((-12)*(-4))+(3*(-4));
		
		// PRINTA OS VALORES DE CADA CALCULO
		
		System.out.printf("========================================================\n\n");
		System.out.println("O primeiro resultado �: " + x * (x+y));
        System.out.println("O segundo resultado �: " + (x * y + b * c));
        System.out.println("O terceiro resultado �: " + x * (y + b) * c);
        System.out.println("O resultado da vari�vel �: " + i);
        System.out.println("O resultado da vari�vel 2 �: " + j);
        System.out.println("O antecessor do numero " + j + " �: " + (j-1));
        System.out.printf("\n\n========================================================");
	}

}
