import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nome;
		char outroFuncionario;
		double valorPorHora, custoTotal;
		int horasTrabalhadas, totalHorasTrabalhadas, opcao;
		boolean novosUsuarios = true;
		
		custoTotal = 0;
		totalHorasTrabalhadas = 0;
		
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
			
			totalHorasTrabalhadas += horasTrabalhadas;
			custoTotal += horasTrabalhadas * valorPorHora;
			
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
			
			if (opcao == 1) {
				System.out.printf("\nTotal de horas = %d%n", totalHorasTrabalhadas);
			} else if (opcao == 2) {
				System.out.printf("\nCusto total = R$ %.2f%n", custoTotal);
			}
			
		} while (opcao != 4);
		
		input.close();

	}

}
