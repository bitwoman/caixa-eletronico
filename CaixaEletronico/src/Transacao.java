public interface Transacao {	
	
/* 	
 * Interface criada para que estes métodos sejam implementados de diferentes 
 * formas nas classes de conta corrente e conta poupança.
 */
	
	public abstract void sacar();
	public abstract void depositar();
	public abstract void transferir();
	
	
}
