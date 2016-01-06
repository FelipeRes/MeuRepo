import java.util.Scanner;

public class questao15 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i < 11; i++){
			int result = i*n;
			System.out.format("%d x %d = %d\n", i,n,result);
		}
		scanner.close();
	}
}
