/*Classe abstrata não pode ser instanciada, criada apenas para que 
 * outras classes herdem seus atributos e métodos.
 */

public abstract class Cliente {
/*	
 * Relacionamento de Associação: quando se tem um objeto como atributo de outro.
 * Cliente possui como atributo a classe Conta.
 */
	protected Agencia nomeAgencia;
	protected Conta numeroConta, senha;
	
/*
 * Método personalizado: - retirada, depósito, transferência.
 */
	public void transacao(String tipoTransacao, float valor) {
		
		switch (tipoTransacao) {

	        case "transferir":
	            System.out.println("Transferência");
	            
	           
	            break;
	        case "sacar":
	            System.out.println("Saque");
	
	            break;
	        case "depositar":
	            System.out.println("Depósito");
	            
	            break;
		}
	}

/*
 * Getters and Setters:
 */
	public Agencia getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(Agencia nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public Conta getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Conta numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Conta getSenha() {
		return senha;
	}

	public void setSenha(Conta senha) {
		this.senha = senha;
	}
}
