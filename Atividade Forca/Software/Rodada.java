package Software;

import java.util.ArrayList;
import java.util.Random;

public class Rodada {
	private Boneco boneco;
	private Jogador jogador;
	private Tema tema;
	private String palavra;
	private String palavraAdivinha = "";
	
	public Rodada(Tema tema) {
		this.tema = tema;
		Random rand = new Random();
		int numero = rand.nextInt(tema.getListaPalavras().size());
		palavra = tema.getListaPalavras().get(numero);
		boneco = new Boneco(6);
		for (int i = 0; i < palavra.length(); i++) {
			palavraAdivinha += "*";
		}
	}

	public String getPalavra() {
		return palavra;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public boolean containString(String palavra){
		if(getPalavra().equals(palavra)){		
			return true;
		}else{
			return false;
		}
	}
	public boolean containChar(String character){
		if(this.palavra.contains(character)){
			String tempPA = "";
			for (int i = 0; i < palavra.length(); i++) {
				if(this.palavra.charAt(i) == character.charAt(0)){ //percorre minha palavra procurando pela letra
					tempPA += character.charAt(0);
				}else{
					tempPA += "*";
				}
				setPalavraAdivinha(tempPA);
			}
			return true;
		}else{
			return false;
		}
	}

	public Boneco getBoneco() {
		return boneco;
	}
	
	public void hitForca(){
		boneco.setVida(boneco.getVida()-1);
	}

	public String getPalavraAdivinha() {
		return palavraAdivinha;
	}
	
	public void setPalavraAdivinha(String palavra){
		palavraAdivinha = palavra;
	}
	
	
}
