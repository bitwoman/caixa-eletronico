import java.util.ArrayList;

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
 * Depósito: ele pode depositar qualquer valor. Esses valores podem ser em cheque 
 * (Recebe uma String no estilo "Dezesseis reais@16,00", separadas por @); podem ser em dinheiro, no caso um valor real.
 */
	public void depositar(Conta conta, String cheque) {
		String[] cheques = cheque.split("\\@");
		
		String valorString = cheques[1];
		float valorCheque = Float.parseFloat(cheques[1]);
		
		if(conta.getStatusConta()) {
			conta.setSaldoConta(conta.getSaldoConta() + valorCheque);
			System.out.println("Depósito feito na conta: " + conta.getNumeroConta());
		}else {
			System.out.println("Impossível depositar numa conta fechada!");
		}
	}
	
	
/*
 * Método transferir
 */
	public void transferir(Conta contaOrigem, Conta contaDestino, float valorTransferencia) {
		if(contaOrigem.getStatusConta()) {
			contaOrigem.sacar(contaOrigem, valorTransferencia);
			System.out.println("Valor retirado, saldo atualizado: " + contaOrigem.getSaldoConta());
	
			if(contaDestino.getStatusConta()) {
				contaDestino.setSaldoConta(contaDestino.getSaldoConta() + valorTransferencia);
				System.out.println("Transferência de " + valorTransferencia + " reais, para a conta " 
								   + contaDestino.getNumeroConta());
			}else {
				System.out.println("Impossível depositar numa conta fechada!");
			}
		}
	}
}
