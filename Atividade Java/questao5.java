import java.util.Scanner;

public class questao5 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int s = scanner.nextInt();
			if(s != 2002){
			System.out.println("Senha Invalida");
			}else{
				System.out.println("Acesso Permitido");
				break;
			}
		}
		
		scanner.close();
	}
}
