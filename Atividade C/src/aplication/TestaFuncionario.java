package aplication;
import data.Data;
import data.Funcionario;
import data.Pessoa;

public class TestaFuncionario {

	public static void main(String args[]){
		Data dia = new Data(19,1,2016);
		
		Pessoa joao = new Pessoa("Joao", "020.123.322-10", "3321483", 23, "Homem");
		Funcionario fun1 = new Funcionario(joao, "Contabilidade", 800, dia);
		fun1.mostrarInfo();
		
		Pessoa pedro = new Pessoa("Joao", "321.345.315-60", "1235343", 31, "Homem");
		Funcionario fun2 = new Funcionario(pedro, "Industria", 3000, dia);	
		fun2.mostrarInfo();
		
		if(fun1 == fun2){
			System.out.println("Funcionarios Iguais");
		}else{
			System.out.println("Diferentes");
		}
				
		
	}
}
