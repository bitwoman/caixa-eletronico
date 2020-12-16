public class Transacao {	
	
/* 	
 * Interface criada para que estes métodos sejam implementados de diferentes 
 * formas nas classes de conta corrente e conta poupança.
 *
	
	public abstract void sacar();
	public abstract void depositar();
	public abstract void transferir();
*/
	
	private static void sacar(Conta conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso! Saldo atualizado: " + conta.getSaldoConta());
		}else {
			System.out.println("Saldo insuficiente para o saque ser realizado: " + conta.getSaldoConta());
		}
	}
	
}
