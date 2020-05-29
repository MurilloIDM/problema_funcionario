import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nome;
		char outroFuncionario;
		double valorPorHora;
		int horasTrabalhadas, opcao;
		boolean novosUsuarios = true;
		
		while (novosUsuarios) {
			
			System.out.print("Nome: ");
			nome = input.next();
			System.out.print("Horas trabalhadas (apenas positivos): ");
			horasTrabalhadas = input.nextInt();
			
			while (horasTrabalhadas <= 0) {
				System.out.print("digite um valor positivo para horas trabalhadas: ");
				horasTrabalhadas = input.nextInt();
			}
			
			System.out.print("Valor por hora (apenas positivos): ");
			valorPorHora = input.nextDouble();
			
			while (valorPorHora <= 0) {
				System.out.print("digite um valor positivo para o valor por hora: ");
				valorPorHora = input.nextDouble();
			}
			
			System.out.print("Digitar outro (S/N)? ");
			outroFuncionario = input.next().charAt(0);
			
			if (outroFuncionario == 'N' || outroFuncionario == 'n') {
				novosUsuarios = false;
			} else {
				novosUsuarios = true;
			}
		}
		
		do {
			System.out.println("\nMENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção: ");
			opcao = input.nextInt();
			
		} while (opcao != 4);
		
		input.close();

	}

}
