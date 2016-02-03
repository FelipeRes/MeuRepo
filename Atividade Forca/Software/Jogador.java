package Software;

public class Jogador {
	private String name;
	private int points;
	
	public Jogador(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}
	
	public void addPoints(int points){
		this.points += points;
	}
	
}
