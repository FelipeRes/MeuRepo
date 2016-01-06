import java.util.Scanner;

public class questao10 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int cont = 0;
		for(int i = 0; i < 5; i++){
			int entrada = scanner.nextInt();
			scanner.nextLine();
			if(entrada%2 == 0){
				cont ++;
			}
			
			
		}
		
		System.out.println(cont + " valores lidos");
		scanner.close();
	}
}
