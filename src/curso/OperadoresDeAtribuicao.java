package curso;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("------------------------------");
		
		n1 *= 2;	// Total: 20.
		n2 += n1;	// Recebe n1 (20) + n2 (30) = Total (50).
		s += "DEF";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
	}

}
