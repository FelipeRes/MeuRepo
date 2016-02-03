package Software;

public class Boneco {
	private int vida;
	private String desenho[] = {" O\n", "/","I","\\\n","/"," \\\n"};

	public Boneco(int vida) {
		super();
		this.vida = vida;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void DrawBoneco(){
		System.out.println("--------------------\n");
		for(int i = vida; i < 6; i++){
			System.out.print(desenho[i]);
		}
		System.out.println("\n--------------------\n");
	}
}
