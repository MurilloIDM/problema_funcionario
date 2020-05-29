import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nome;
		char outroFuncionario;
		double valorPorHora;
		int horasTrabalhadas;
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
		
		input.close();

	}

}
