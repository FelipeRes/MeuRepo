 import java.util.Scanner;
import javax.swing.JOptionPane;

class Uri7{
    public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		double A = scanner.nextInt();
		scanner.nextLine();

		double B = scanner.nextInt();
		scanner.nextLine();
		
		double C = scanner.nextInt();
		scanner.nextLine();
		
		double D = scanner.nextInt();
		scanner.nextLine();
		
		double DIF = (A*B - C*D);
		System.out.format("DIFERENÇA = %.2f",DIF);
	}
}