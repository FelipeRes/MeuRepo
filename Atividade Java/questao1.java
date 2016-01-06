
import java.util.Scanner;

public class questao1 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int km = scanner.nextInt();
		scanner.nextLine();

		float litros = scanner.nextFloat();
		scanner.nextLine();
		
		float resultado = km/litros;
		
		System.out.println(resultado + " km/l");
		scanner.close();
	}

}
