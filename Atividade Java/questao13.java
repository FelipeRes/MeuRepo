import java.util.Scanner;

public class questao13 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int x =  scanner.nextInt();
			int y = scanner.nextInt();
			
			if(x > 0 && y > 0){
				System.out.println("primeiro");
			}else if(x > 0 && y < 0){
				System.out.println("quarto");
			}else if(x < 0 && y > 0){
				System.out.println("segundo");
			}else if(x < 0 && y < 0){
				System.out.println("terceiro");
			}else if(x == 0 || y == 0){
				break;
			}
		}
		scanner.close();
	}
}