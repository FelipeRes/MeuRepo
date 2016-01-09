package data;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		SetData(dia, mes, ano);
	}
	
	public void SetData(int dia, int mes, int ano){
		if(dia >= 0 && dia <= 31 && mes >= 0 && mes <=12 && ano >=0 && ano <= 2016){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else{
			System.out.println("Data Invalida");
		}
	}
	public void mostrarData(){
		System.out.println(dia + "/" + mes + "/" + ano);
	}
	public String getData(){
		String dataChar = dia + "/" + mes + "/" + ano;
		return dataChar;
	}
}
