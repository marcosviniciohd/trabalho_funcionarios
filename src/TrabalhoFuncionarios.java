import java.util.Locale;
import java.util.Scanner;

public class TrabalhoFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char parar = 'S';
		String nome;
		int horasTrabalhadas, numMenu, opcao;
		double valorPorHora;
		
		//Dados do funcionário
		while (parar == 'S') {
			System.out.print("Nome: ");
			nome = sc.next();
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
		
		//MENU
		numMenu = 0;
		while (numMenu != 4) {
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			if (opcao == 4) {
				System.out.println("FIM DO PROGRAMA");
				break;
			}
	
		}
		
		
		sc.close();
		
	}

}
