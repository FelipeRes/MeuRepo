package Model;

public class Restaurante {
	
	private String nome;
	private Mesa[] mesa;
	private int mesasAbertas;
	
	public Restaurante(String nome, int number){
		this.nome = nome;
		mesa = new Mesa[number];
		for(int i = 0; i < number; i++){
			mesa[i] = new Mesa(i);
			mesa[i].setStatus(Mesa.DISPONIVEL);
		}
	}
	
	public Mesa abrirMesa(int index){
		mesa[index].setStatus(Mesa.OCUPADA);
		mesasAbertas++;
		return mesa[index];
	}
	
	public int getMesasDisponiveis(){
		return mesa.length - mesasAbertas;
	}
	
	public Mesa[] getMesas(){
		return mesa;
	}
	
	public String toString(){
		return this.nome + ", " + this.mesa.length;
	}
}
