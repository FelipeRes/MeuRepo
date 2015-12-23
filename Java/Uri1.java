import java.util.Scanner;
import javax.swing.JOptionPane;

class Uri1{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		scanner.nextLine();

		int B = scanner.nextInt();
		scanner.nextLine();
		
		int X = A + B;
		System.out.println("X = " + X);
	}
}