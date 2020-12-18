public abstract class Transacao {	
	
/*
 * M�TODOS PERSONALIZADOS
 */
	
	
/*
 * M�todo sacar	
 */
	public void sacar(Conta conta, double valor) {
		if(conta.getStatusConta()) {
			if(conta.getSaldoConta() >= valor) {
				conta.setSaldoConta(conta.getSaldoConta() - valor);
				System.out.println("Saque realizado na conta: " + conta.getNumeroConta() + conta);
				System.out.println("Saldo atualizado: " + conta.getSaldoConta());
			}else {
				System.out.println("Saldo insuficiente!");
				System.out.println("Saldo: " + conta.getSaldoConta());
			}
		}else {
			System.out.println("Conta fechada!");
		}
	}
	
	
/*
 * M�todo depositar	
 */
	public void depositar(Conta conta, float valor) {
		if(conta.getStatusConta()) {
			conta.setSaldoConta(conta.getSaldoConta() + valor);
			System.out.println("Dep�sito feito na conta: " + conta.getNumeroConta());
		}else {
			System.out.println("Imposs�vel depositar numa conta fechada!");
		}
	}
	
	
/*
 * M�todo transferir
 */
	public void transferir(Conta contaDestino, float valor) {
		if(contaDestino.getStatusConta()) {
			contaDestino.setSaldoConta(contaDestino.getSaldoConta() + valor);
			System.out.println("Transfer�ncia realizada para a conta: " + contaDestino.getNumeroConta());
		}else {
			System.out.println("Imposs�vel depositar numa conta fechada!");
		}
	}
}
