import java.util.Scanner;
import javax.swing.JOptionPane;

class Uri2{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		scanner.nextLine();

		float area = (float)(3.14 * A*A);
		System.out.format("%.4f",area);
	}
}