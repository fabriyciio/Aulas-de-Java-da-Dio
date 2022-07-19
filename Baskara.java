import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double soma ,x ;
		
		System.out.println("Digite o Primeiro Numero: ");
		x = sc.nextDouble();
		
		soma = 0;
		
		while (x != 0) {
			soma= soma + x;
			System.out.println("digte outro numero:");
			x =sc.nextDouble();
		}
		System.out.println("SOMA:"+"R$"+soma );
		sc.close();
	}

}
