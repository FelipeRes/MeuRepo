
public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data data = new Data();
	private String RG;
	private boolean isEmpregado;
	

	public void receberAumento(double valor){
		salario += valor;
	}
	public void mostrarInfo(){
		System.out.format("Nome = %s, Departamento = %s, Salarios: %.2fR$, Data de entrada: %s\n", nome, departamento, salario, data.getData());
	}
	
	public void setNome(String palavra){
		nome = palavra;
	}
	public void mudarDepartamento(String palavra){
		departamento = palavra;
	}
	public void setData(int dia, int mes, int ano){
		data.SetData(dia, mes, ano);
	}
	
}
