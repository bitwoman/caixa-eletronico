public abstract class Transacao {	
	
/*
 * MÉTODOS PERSONALIZADOS
 */
	
	
/*
 * Método sacar	
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
 * Método depositar	
 */
	public void depositar(Conta conta, float valor) {
		if(conta.getStatusConta()) {
			conta.setSaldoConta(conta.getSaldoConta() + valor);
			System.out.println("Depósito feito na conta: " + conta.getNumeroConta());
		}else {
			System.out.println("Impossível depositar numa conta fechada!");
		}
	}
	
	
/*
 * Método transferir
 */
	public void transferir(Conta contaDestino, float valor) {
		if(contaDestino.getStatusConta()) {
			contaDestino.setSaldoConta(contaDestino.getSaldoConta() + valor);
			System.out.println("Transferência realizada para a conta: " + contaDestino.getNumeroConta());
		}else {
			System.out.println("Impossível depositar numa conta fechada!");
		}
	}
}
