 import java.util.Scanner;
import javax.swing.JOptionPane;

class Uri9{
    public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.next();
		scanner.nextLine();

		double salario = scanner.nextfloat();
		scanner.nextLine();
		
		double vendas = scanner.nextFloat();
		scanner.nextLine();
		
		double total = salario + (vendas/100*15);
		
		System.out.println("TOTAL = R$" + total);
	}
}