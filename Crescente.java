import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int y, x ;
		
		System.out.println("Digite um numero:");
		x = sc.nextInt();
		
		System.out.println("Digite um numero:");
		y = sc.nextInt();
		
		while (x != y) {
			
			if (x < y) {
				System.out.println("CRESCENTE");
			}
			else {
			System.out.println("DECRESENTE ");	
			}
			
			System.out.println("Digite outro numero:");
			x = sc.nextInt();
			
			System.out.println("Digite outro numero:");
			y = sc.nextInt();
		}
		sc.close();

	}

}
