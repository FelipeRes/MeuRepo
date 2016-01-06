import java.util.Scanner;

public class questao16 {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i<3; i++){
			String tipo = scanner.nextLine();
			str.append(tipo.charAt(0));
			str.append(tipo.charAt(1));
			str.append(tipo.charAt(2));
		}
		String code = str.toString();
		
		if(code.equals("veravecar")){
			System.out.println("aguia");
		}
		if(code.equals("veraveoni")){
			System.out.println("pomba");
		}
		if(code.equals("vermamoni")){
			System.out.println("homem");
		}
		if(code.equals("vermamher")){
			System.out.println("vaca");
		}
		if(code.equals("invinshem")){
			System.out.println("pulga");
		}
		if(code.equals("invinsher")){
			System.out.println("lagartixa");
		}
		if(code.equals("invanehem")){
			System.out.println("sanguessuga");
		}
		if(code.equals("invaneoni")){
			System.out.println("minhoca");
		}
		
		scanner.close();
	}
}
