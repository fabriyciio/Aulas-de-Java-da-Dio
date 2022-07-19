import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1 ,nota2, notaFinal;
		
		System.out.println("Digite a Primeira Nota");
		nota1= sc.nextDouble();
		
		System.out.println("Digite a Segunda Nota");
		nota2= sc.nextDouble();
		
		notaFinal= nota1 + nota2;
		
		System.out.println("Sua Nota final é:" + notaFinal);
		
		if(notaFinal >= 70){
			System.out.println("Aprovado");
		}
		else{
			System.out.println("REPROVADO");
		}
		
		
		
		sc.close();

	}

}
