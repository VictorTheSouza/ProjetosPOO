package victor.projetofuncion�rio;

public class Funcionario {

	 String nome;
	 String id;
	 String cargo;
	 int salario;
	 int trabalhar;
	 int horasExtras;
	 int salarioFinal = salario + (horasExtras *10);
	
	
	
	
	
	public int trabalhar( int horasTrabalhadas) {
		System.out.println(" Esse � o n�mero de horas trabalhadas:" + horasTrabalhadas);
		 return horasTrabalhadas;
	
	}
	
	public int horasExtras( int horasExtras ) {
		System.out.println(" Esse � o n�mero de horas extras " + horasExtras);
		salarioFinal = salario + (horasExtras*10);
		return horasExtras;
	
		
	}
	public int receber () {
		System.out.println("Esse � seu sal�rio final: " + salarioFinal);
		return salarioFinal;
	}
	
	
}
