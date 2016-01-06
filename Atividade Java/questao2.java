import java.util.Scanner;
public class questao2 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		
		double salario = scanner.nextDouble();
		scanner.nextLine();
		
		double totalDeVendas = scanner.nextDouble();
		scanner.nextLine();
		
		
		double total = salario + totalDeVendas*15/100;
		System.out.format("TOTAL = %.2f",  total);
		scanner.close();
	}
}
