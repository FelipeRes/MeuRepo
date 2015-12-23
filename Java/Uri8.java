 import java.util.Scanner;
import javax.swing.JOptionPane;

class Uri8{
    public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		scanner.nextLine();

		int horas = scanner.nextInt();
		scanner.nextLine();
		
		float valor = scanner.nextFloat();
		scanner.nextLine();
		
		float total = valor*horas;
		System.out.println("NUMBER = " + number);
		System.out.format("SALARY = U$ %.2f",total);
	}
}