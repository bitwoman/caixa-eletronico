
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
 * Polimorfismo do m�todo abrirConta herdado da classe Conta.
 * O polimorfismo de sobreposi��o (override) nos permite reescrever 
 * nas classes filhas, todavia, os m�todos que ser�o sobrepostos, 
 * devem possuir a mesma assinatura da classe M�e.
 */
	
	@Override
	public void abrirConta(String tipoConta) {
		if(this.getStatusConta() == false) {
			//A prefer�ncia do java � por equals(), todavia, '==' funciona.
			if(tipoConta == "CC") {
				this.setTipoConta(tipoConta);
				this.setStatusConta(true);
				this.setSaldoConta(50);
				
				System.out.println("Conta corrente aberta com sucesso!");
			}else {
				System.out.println("Conta n�o � corrente!");
			}
		}else {
			System.out.println("Conta j� existe");
		}
}

/*
	Polimorfismo do tipo sobrecarga (overload) que consiste em criar varia��es de um mesmo m�todo.
	Ou seja, mesma assinatura (quantidade de vari�veis).
	

	Dep�sito: ele pode depositar qualquer valor. Esses valores podem ser em cheque 
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
