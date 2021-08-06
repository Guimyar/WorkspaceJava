
public class FolhaDePagamento {
	
	private int numeroFuncionario;
	private String nome;
	private String email;
	private double salario;
	
	
	public String exibir() {
		return numeroFuncionario + " "+nome+" ("+email+") R$ "+salario;
	}
	
	
	public void reajustarSalario(double percentual) {
		salario = salario + salario *percentual / 100;
	}
	
	
	public double calcularImposto() {
		double imposto=0;	
		if(salario <= 2000) {
			return 0.0;
				
		}else if(salario > 2000 && salario <= 3000) {
			return imposto = salario * 0.15;
			
			}else if (salario > 3000 && salario <= 4500) {
				return imposto = salario * 0.25;
				
				}else if (salario > 4500) {
					return imposto = 2250;
					}
		return imposto;		
		}


	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}


	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
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
	
	
}
