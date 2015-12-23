 import java.util.Scanner;
import javax.swing.JOptionPane;
// não sei o que fazer aqui  -- to com muito sono para continuar
class Uri10{
    public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		String peca1 = scanner.next();
		scanner.nextLine();

		String peca2 = scanner.next();
		scanner.nextLine();
		
		String p1[] = new String[3];
		p1 = peca1.split(" ");
		
		String p2[] = new String[3];
		p1 = peca2.split(" ");
		
		float total1 = (float)(Float.parseFloat(p1[1]));
		//float total2 = Float.parseFloat(p2[1]) * Float.parseFloat(p2[2]);
		//float total3 = total1 + total2;
		//Float.parseFloat()
		//integer.parseInteger()
		//System.out.println("TOTAL = R$" + total3);
	}
}