
public class Funcionario {
	
	int numeroFuncional;
	String nome;
	String email;
	double salario;
	
	public Funcionario(int numero, String nome, String email, double salario) {
		this.numeroFuncional = numero;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		
	}
	
	public int getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	void reajustarSalario(double percentual) {
		salario = salario + salario*percentual;
		
	}
	
	String exibirInfo() {
		String info = "nome: "+nome+"\nemail: "+email+"\nNFuncional: "+numeroFuncional+"\nsalario: "+salario;
		return info; 
	}
	
	double calcularImposto() {
		double imposto = 0;
		if(salario>2000 && salario<=3000)
			imposto = 0.15;
		else if(salario>3000 && salario<=4500)
			imposto = 0.25;
		else if(salario>4500)
			imposto = 2250;
		return imposto;	
	}
}
