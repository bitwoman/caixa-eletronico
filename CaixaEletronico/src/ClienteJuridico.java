public class ClienteJuridico extends Cliente {
//	Atributos:
	protected int CNPJ;
	protected String razaoSocial, nomeFantasia;
	
	
//	Construtor:
	public ClienteJuridico(int cNPJ, String razaoSocial, String nomeFantasia) {
		CNPJ = cNPJ;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}
	

//	Getters and Setters:
	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}	
}
