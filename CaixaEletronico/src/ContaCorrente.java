
public class ContaCorrente extends Conta {
/*
 * Atributos:
 */
	private static double CPMF = 0.38;
	
/*
 * Getters and Setters:
 */
	public static double getCPMF() {
		return CPMF;
	}

	public static void setCPMF(double cPMF) {
		CPMF = cPMF;
	}

/*
 * Construtor:
 */
	public ContaCorrente(int numeroConta, Agencia nomeAgencia, String banco, String senha) {
		super(numeroConta, nomeAgencia, banco, senha);
	}

/*	
 * Polimorfismo do método abrirConta herdado da classe Conta.
 * O polimorfismo de sobreposição (override) nos permite reescrever 
 * nas classes filhas, todavia, os métodos que serão sobrepostos, 
 * devem possuir a mesma assinatura da classe Mãe.
 */
	
	@Override
	public void abrirConta(String tipoConta) {
		if(this.getStatusConta() == false) {
			//A preferência do java é por equals(), todavia, '==' funciona.
			if(tipoConta == "CC") {
				this.setTipoConta(tipoConta);
				this.setStatusConta(true);
				this.setSaldoConta(50);
				
				System.out.println("Conta corrente aberta com sucesso!");
			}else {
				System.out.println("Conta não é corrente!");
			}
		}else {
			System.out.println("Conta já existe");
		}
}

/*
	Polimorfismo do tipo sobrecarga (overload) que consiste em criar variações de um mesmo método.
	Ou seja, mesma assinatura (quantidade de variáveis).
	

	Depósito: ele pode depositar qualquer valor. Esses valores podem ser em cheque 
	(Recebe uma String no estilo "Dezesseis reais@16,00", separadas por @); podem ser em dinheiro, 
	no caso um valor real.
 
*/
	
	/*@Override
	public void depositar(String cheque) {
		this.cheque = cheque;
		
	}
	
	
	public void depositar(double valor) {
		this.valor = valor;
		
	}
	
	@Override
	public void sacar() {
		if(this.getStatusConta()) {
			if(this.getSaldoConta() >= getValor()) {
				this.setSaldoConta(this.getSaldoConta() - (valor + (valor * this.CPMF)));
				System.out.println("Saque realizado na conta de " + this.getNomeCliente());
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Conta fechada!");
		}
	}

	@Override
	public void transferir() {
		
	}

*/
}
