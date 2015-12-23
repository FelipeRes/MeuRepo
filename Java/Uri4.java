 import java.util.Scanner;
import javax.swing.JOptionPane;

class Uri4{
    public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		scanner.nextLine();

		int B = scanner.nextInt();
		scanner.nextLine();
		
		int PROD = A * B;
		System.out.println("PROD = " + PROD);
	}
}