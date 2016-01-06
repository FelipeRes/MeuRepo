import java.util.Scanner;

public class questao4 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i = 1; i < (N*4); i++){
			
			if(i%4 == 0){
				System.out.println("IFPI");
			}else{
				System.out.printf(i + " ");
			}
		}
		
		scanner.close();
	}
}
