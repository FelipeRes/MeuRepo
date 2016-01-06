import java.util.Scanner;

public class questao6 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
			
		int n = scanner.nextInt();
		scanner.nextLine();
		
		int quantidade = 0;
		int coelho = 0;
		int sapo = 0;
		int rato = 0;
		
		for(int i = 0; i < n; i++){
			int valor = scanner.nextInt();
			char letra = scanner.next().charAt(0);
			
			quantidade += valor;
			if(letra == 'C'){
				coelho += valor;
			}
			if(letra == 'S'){
				sapo += valor;
			}
			if(letra == 'R'){
				rato += valor;
			}
		}
		double c = (double) (coelho*(100/quantidade));
		double r = (double) (rato*(100/quantidade));
		double s = (double) (sapo*(100/quantidade));
		
		System.out.println("Total: " + quantidade + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
	
		
		System.out.println("Percentual de coelhos: " + c);
		System.out.println("Percentual de ratos: " + r);
		System.out.println("Percentual de sapos: " + s);
		scanner.close();
	}

}
