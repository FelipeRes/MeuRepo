package data;

public class Funcionario {
	private Pessoa funcionario;
	private String departamento;
	private double salario;
	private Data data;
	//private boolean isEmpregado;
	
	
	public Funcionario(Pessoa funcionario, String departamento, double salario, Data data){
		this.funcionario = funcionario;
		this.departamento = departamento;
		this.salario = salario;
		this.data = data;
	}
	
	public void receberAumento(double valor){
		salario += valor;
	}
	public void mostrarInfo(){
		System.out.format("Nome = %s, Departamento = %s, Salarios: %.2fR$, Data de entrada: %s\n", funcionario.getNome(), departamento, salario, data.getData());
	}

	public void mudarDepartamento(String palavra){
		departamento = palavra;
	}
	
}
