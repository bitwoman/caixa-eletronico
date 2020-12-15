public class Conta {
//	Atributos:
	private int numeroConta;
    private Agencia nomeAgencia;
    private String banco, senha, tipoConta, nomeCliente;
    private double saldoConta, valor;
    private boolean statusConta;

    
//    Construtor:
    public Conta(int numeroConta, Agencia nomeAgencia, String banco, String senha) {
  		this.numeroConta = numeroConta;
  		this.nomeAgencia = nomeAgencia;
  		this.banco = banco;
  		this.senha = senha;
  		this.saldoConta = 0;
  		this.statusConta = false;
  		this.valor = 0;
  	}
    
    
//  Getters and Setters:
	public int getNumeroConta() {
		return numeroConta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Agencia getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(Agencia nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public boolean getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}
	
	
//	Métodos personalizados:
	public void abrirConta(String tipoConta) {
		this.setTipoConta(tipoConta);
		this.setStatusConta(true);
		
		if(this.getStatusConta() == false) {
			this.setTipoConta(tipoConta);
			this.setStatusConta(true);
			
			System.out.println("Conta criada!");
		}else {
			System.out.println("Conta já existe");
		}
	}
	
	public void fecharConta() {
		if(saldoConta > 0) {
			System.out.println("Ainda há dinheiro.");
		}else if(this.getSaldoConta()<0){
			System.out.println("Há débito pendente...");
		}else {
			this.setStatusConta(false);
			System.out.println("Conta fechada.");
		}
	}
	
	public void statusAtualConta() {
		System.out.println("\n================================\n");
		System.out.println("Conta: " + this.getNumeroConta());
		System.out.println("Tipo: " + this.getTipoConta());
		System.out.println("Dono: " + this.getNomeCliente());
		System.out.println("Saldo: " + this.getSaldoConta());
		System.out.println("Status: " + this.getStatusConta());
	}

}