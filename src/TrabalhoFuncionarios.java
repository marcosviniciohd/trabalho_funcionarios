import java.util.Locale;
import java.util.Scanner;

public class TrabalhoFuncionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char parar = 'S';
		String nome;
		int horasTrabalhadas;
		double valorPorHora;
		
		while ( parar == 'S' ) {
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();
			if (horasTrabalhadas <= 0) {
				System.out.print("Horas trabalhadas deve ser maior que zero, tente novamente! ");
				horasTrabalhadas = sc.nextInt();
			}
			System.out.print("Valor por hora: ");
			valorPorHora = sc.nextDouble();
			if (valorPorHora <= 0.0) {
				System.out.print("O valor da hora trabalhada deve ser maior que zero, tente novamente! ");
				valorPorHora = sc.nextDouble();
			}
			System.out.print("Digitar outro (S/N)? ");
			parar = sc.next().charAt(0);	
			
		}
		
	}

}
