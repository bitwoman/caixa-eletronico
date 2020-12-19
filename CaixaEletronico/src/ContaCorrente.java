
public class ContaCorrente extends Conta {
/*
 * Atributos:
 */
	private static double CPMF = 0.38;
	
/*
 * To String
 */
	@Override
	public String toString() {
		String c = "Conta Corrente [";
		
    	c += super.toString();
		c += "]";
		
    	return c;
	}
	
	
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
	public ContaCorrente(int numeroConta, String tipoConta, Agencia nomeAgencia, String banco, String senha) {
		super(numeroConta, tipoConta, nomeAgencia, banco, senha);
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
 * Polimorfismo do tipo sobrecarga (overload) que consiste em criar variações de um mesmo método.
 * Ou seja, mesma assinatura (quantidade de variáveis).
 */

	
/*
 * Sacar
 */
	@Override
	public void sacar(Conta conta, double valor) {
//		super.sacar(conta, valor);
		if(conta.getStatusConta()) {
			if(conta.getSaldoConta() >= valor) {
				conta.setSaldoConta(conta.getSaldoConta() - (valor + (valor * this.CPMF)));
				System.out.println("Saque realizado na conta: " + conta.getNumeroConta());
			}else {
				System.out.println("Saldo insuficiente!");
				System.out.println("Saldo: " + conta.getSaldoConta());
			}
		}else {
			System.out.println("Conta fechada!");
		}
	}
}
