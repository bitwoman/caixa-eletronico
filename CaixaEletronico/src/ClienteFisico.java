public class ClienteFisico extends Cliente {
/*
 * Atributos:
 */
	protected long cpfCliente, rgCliente;
	protected int idade;
	
/*
 * 	Construtor:
 */
	public ClienteFisico(long cpfCliente, long rgCliente, int idade) {
		this.cpfCliente = cpfCliente;
		this.rgCliente = rgCliente;
		this.idade = idade;
	}
	
/*
 * 	Getters and Setters:
 */
	public long getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(long cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	public long getRgCliente() {
		return rgCliente;
	}
	
	public void setRgCliente(long rgCliente) {
		this.rgCliente = rgCliente;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}	
}
