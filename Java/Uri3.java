 import java.util.Scanner;
import javax.swing.JOptionPane;

class Uri3{
    public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		scanner.nextLine();

		int B = scanner.nextInt();
		scanner.nextLine();
		
		int SOMA = A + B;
		System.out.println("SOMA = " + SOMA);
	}
}