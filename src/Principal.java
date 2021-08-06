

public class Principal {
	public static void main(String[] args) {
		
		Funcionario andre = new Funcionario(1,"Andre","andre@mail.com",9000);
		Funcionario fabio = new Funcionario(2,"Fabio","fabio@mail.com",1500);
		Funcionario max = new Funcionario(3,"Max","max@mail.com",5800);
		
		andre.setSalario(8000);
		fabio.setSalario(2000);
		max.setSalario(1999);
		
		System.out.printf("Nome\tSalario\tImposto\n");
		System.out.printf(andre.nome+"\t"+andre.salario+"\t"+andre.calcularImposto()+"\n");
		System.out.printf(fabio.nome+"\t"+fabio.salario+"\t"+fabio.calcularImposto()+"\n");
		System.out.printf(max.nome+"\t"+max.salario+"\t"+max.calcularImposto()+"\n");
		
	}
}
