package Software;
import java.util.ArrayList;

public class Tema {
	private String name;
	private ArrayList<String> listaPalavras = new ArrayList<String>();
	
	public Tema(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getListaPalavras() {
		return listaPalavras;
	}
	
	public void addToList(String palavra){
		listaPalavras.add(palavra);
	}
}
