import java.util.Scanner;

public class questao14 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		double media = 0;
		int qnt = 0;
		while(true){
			double entrada = scanner.nextInt();
			scanner.nextLine();
			
			if(entrada < 0){
				break;
			}else{
				media += entrada;
				qnt ++;
			}
		}
		media = media/qnt;
		
		System.out.println(media);
		scanner.close();
	}
}
