package victor.projetofuncionário;

public class TesteFuncionário {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		
		func1.nome = "Victor";
		func1.cargo = "Dev";
		func1.id = "68913";
		func1.salario = 2000;
		
		
		
		System.out.println(func1.nome);
		System.out.println(func1.cargo);
		System.out.println(func1.salario);
		System.out.println(func1.id);
		
		func1.trabalhar(45);
		func1.horasExtras(5);
		func1.receber();
		
		
				
	}

}
