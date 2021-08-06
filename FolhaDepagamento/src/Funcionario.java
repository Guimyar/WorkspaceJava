

public class Funcionario {
	public static void main(String[] args) {
		
		
		FolhaDePagamento f1;
		f1 = new FolhaDePagamento();
		f1.setNumeroFuncionario(101021);
		f1.setNome("Livia");
		f1.setEmail("livs@gmail.com");
		f1.setSalario(1000);
		
		FolhaDePagamento f2;
		f2 = new FolhaDePagamento();
		f2.setNumeroFuncionario(101031);
		f2.setNome("Andreia");
		f2.setEmail("deia@gmail.com");
		f2.setSalario(3500);
	
		FolhaDePagamento f3;
		f3 = new FolhaDePagamento();
		f3.setNumeroFuncionario(101041);
		f3.setNome("Jonas");
		f3.setEmail("jonas@gmail.com");
		f3.setSalario(20000);
		
		System.out.println(f1.exibir() + "   Imposto " + f1.calcularImposto());
		System.out.println(f2.exibir() + "   Imposto " + f2.calcularImposto());
		System.out.println(f3.exibir() + "   Imposto " + f3.calcularImposto());
		
		f1.reajustarSalario(15);
		f2.reajustarSalario(20);
		f3.reajustarSalario(25);
		
		System.out.println(f1.exibir() + "   Imposto " + f1.calcularImposto());
		System.out.println(f2.exibir() + "   Imposto " + f2.calcularImposto());
		System.out.println(f3.exibir() + "   Imposto " + f3.calcularImposto());;
		
		
	}
}

