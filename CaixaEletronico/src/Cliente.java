/*Classe abstrata não pode ser instanciada, criada apenas para que 
 * outras classes herdem seus atributos e métodos.
 */

public abstract class Cliente {
/*	
 * Relacionamento de Associação: quando se tem um objeto como atributo de outro.
 * Cliente possui como atributo a classe Conta.
 */
	protected String nomeCliente, enderecoClinte, telefoneCliente;
	protected double rendaCliente;
	protected long cepCliente;
	protected Agencia nomeAgencia;
	protected Conta numeroConta; 
	protected long senha;

	
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

	public long getSenha() {
		return senha;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoClinte() {
		return enderecoClinte;
	}

	public void setEnderecoClinte(String enderecoClinte) {
		this.enderecoClinte = enderecoClinte;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public double getRendaCliente() {
		return rendaCliente;
	}

	public void setRendaCliente(double rendaCliente) {
		this.rendaCliente = rendaCliente;
	}

	public long getCepCliente() {
		return cepCliente;
	}

	public void setCepCliente(long cepCliente) {
		this.cepCliente = cepCliente;
	}
}