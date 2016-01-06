import java.util.Scanner;

public class questao11 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int entrada = 0;
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		while(entrada != 4){
			entrada = scanner.nextInt();
			scanner.nextLine();
			
			if(entrada == 1){
				alcool += 1;
			}
			if(entrada == 2){
				gasolina += 1;
			}
			if(entrada == 3){
				disel += 1;
			}
			if(entrada == 4){
				break;
			}
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Disel: " + disel);
		scanner.close();
	}
}
