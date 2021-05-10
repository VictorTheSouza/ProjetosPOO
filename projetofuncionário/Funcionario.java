package victor.projetofuncionário;

public class Funcionario {

	 String nome;
	 String id;
	 String cargo;
	 int salario;
	 int trabalhar;
	 int horasExtras;
	 int salarioFinal = salario + (horasExtras *10);
	
	
	
	
	
	public int trabalhar( int horasTrabalhadas) {
		System.out.println(" Esse é o número de horas trabalhadas:" + horasTrabalhadas);
		 return horasTrabalhadas;
	
	}
	
	public int horasExtras( int horasExtras ) {
		System.out.println(" Esse é o número de horas extras " + horasExtras);
		salarioFinal = salario + (horasExtras*10);
		return horasExtras;
	
		
	}
	public int receber () {
		System.out.println("Esse é seu salário final: " + salarioFinal);
		return salarioFinal;
	}
	
	
}
