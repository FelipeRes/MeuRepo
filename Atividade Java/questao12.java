import java.util.Scanner;

public class questao12 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		double entrada = 0;
		int cont = 0;
		double media = 0;
		while(cont != 2){
			entrada = scanner.nextDouble();
			scanner.nextLine();
			
			if(entrada >= 0 && entrada <= 10){
				media += entrada;
				cont ++;
			}else{
				System.out.println("Nota inválida");
			}
			
		}
		media /= 2;
		System.out.format("media = %.2f", media);
		scanner.close();
	}
}