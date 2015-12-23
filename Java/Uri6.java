 import java.util.Scanner;
import javax.swing.JOptionPane;

class Uri6{
    public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		double A = scanner.nextInt();
		scanner.nextLine();

		double B = scanner.nextInt();
		scanner.nextLine();
		
		double C = scanner.nextInt();
		scanner.nextLine();
		
		double MEDIA = (A*2 + B*3 + C*5)/10;
		System.out.format("MEDIA = %.2f", MEDIA);
	}
}