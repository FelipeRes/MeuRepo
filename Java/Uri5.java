 import java.util.Scanner;
import javax.swing.JOptionPane;

class Uri5{
    public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		float A = scanner.nextInt();
		scanner.nextLine();

		float B = scanner.nextInt();
		scanner.nextLine();
		
		float MEDIA = (A + B)/2;
		System.out.format("MEDIA = %.5f", MEDIA);
	}
}