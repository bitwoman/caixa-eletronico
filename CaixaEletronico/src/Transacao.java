public interface Transacao {	
	
/* 	
 * Interface criada para que estes m�todos sejam implementados de diferentes 
 * formas nas classes de conta corrente e conta poupan�a.
 */
	
	public abstract void sacar();
	public abstract void depositar();
	public abstract void transferir();
	
	
}
