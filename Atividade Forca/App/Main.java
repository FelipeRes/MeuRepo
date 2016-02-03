package App;
import java.util.Scanner;
import Software.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Tema tema = new Tema("Jogos");
		tema.addToList("BioShock");
		tema.addToList("GTA");
		tema.addToList("Bayonetta");
		tema.addToList("Minecraft");
		
		Rodada rodada = new Rodada(tema);
		//System.out.println("A palavra da rodade é: " + rodada.getPalavra());
		
		System.out.println("Digite o seu nome: ");
		String playerName = scanner.nextLine();
		Jogador player = new Jogador(playerName);
		
		while(true){
			System.out.println(" -- > "+ rodada.getPalavraAdivinha() + " < --");
			System.out.println("1 - Palavra\n2 - Letra");
			int resposta = scanner.nextInt();
			scanner.nextLine();
			if(resposta == 1){
				String palavraResposta = scanner.nextLine();
				if(rodada.containString(palavraResposta)){
					System.out.println("Parabéns, você ganhou!\n + 100 Pontos");
					player.addPoints(100);
					break;
				}else{
					System.out.println("Você errou");
					rodada.hitForca();
				}
			}else if(resposta == 2){
				String palavraResposta = ""; 
				palavraResposta += scanner.next().charAt(0);
				if(rodada.containChar(palavraResposta)){
					System.out.println("Acertou uma letra");
					System.out.println("+ 10 Pontos");
					player.addPoints(100);
				}else{
					System.out.println("Errou uma letra");
					rodada.hitForca();
				}
			}
			rodada.getBoneco().DrawBoneco();
			if(rodada.getBoneco().getVida() == 0){
				System.out.println("Perdeu Vacilao");
				break;
			}
		}
		System.out.println("GAME OVER");
		System.out.println(player.getName() + " - Pontuação: " + player.getPoints());
		
		
		
	}
}
