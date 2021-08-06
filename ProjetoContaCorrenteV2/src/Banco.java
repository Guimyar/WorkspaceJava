import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		/*qual o intuito desta aplicação?
		 1 - Declarar nossas variáveis do tipo "Conta"
		 2 - vamos fazer um menu pra manipular 1 conta so?
		     depositar, sacar e exibir infos?
		 3 - toda interação com o usuário (print e scanner) fica aqui
		 */
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		
		Conta c1;
		c1 = new Conta();
		c1.setNumeroConta(1232);
		c1.setDigitoVerif(6);
		c1.setNomeTitular("Professor Isidro");
		c1.setCpfTitular("3501.135.109-09");
		c1.setSaldo(200.00);
		
		//agora vem meu menu!!
		do {
			System.out.println("Bem vindo ao IsiTau - Seu banco na NET ");
			System.out.println("Digite 1-Info / 2-Deposito / 3-Saque / 0-Encerrar");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1: 
				System.out.println(c1.exibir());
				break;
			case 2:
				System.out.println("[DEPOSITO] Digite o valor: ");
				valor = teclado.nextDouble();
				c1.depositar(valor);
				break;
			case 3:
				System.out.println("[SAQUE] Digite o valor: ");
				valor = teclado.nextDouble();
				if(c1.sacar(valor)) {
					System.out.println("    Saque Autorizado");
				}
				else {
					System.out.println("    Saldo Insuficiente");
				}
				break;
			case 0: 
				System.out.println("-----> Obrigado pela preferência!");
				break;
			default:
				System.out.println("ERRO: Opcao invalida");
			}
			
		}while (opcao != 0);
		
		teclado.close();
		
	}
}
