
public class TestaFuncionario {

	public static void main(String args[]){
		
		Funcionario fun1 = new Funcionario();
		fun1.receberAumento(100);
		fun1.setNome("Felipe");
		fun1.mudarDepartamento("Contabilidade");
		fun1.setData(10, 11, 2013);
		fun1.mostrarInfo();
		
		Funcionario fun2 = new Funcionario();
		fun2.receberAumento(200);
		fun2.setNome("Danilo");
		fun2.mudarDepartamento("Marketing");
		fun2.setData(2, 3, 2014);
		fun2.mostrarInfo();
		
		if(fun1 == fun2){
			System.out.println("Funcionarios Iguais");
		}else{
			System.out.println("Diferentes");
		}
		
		Funcionario primeiroFun = fun1;
		
		
		
	}
}
