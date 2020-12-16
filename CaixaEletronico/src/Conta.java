public class Conta {
/*
 * 	Atributos:
 */
	private long numeroConta;
	private int quantidadeUsuarios;
    private Agencia agencia;
    private String banco, senha, tipoConta, nomeCliente;
    private double saldoConta;
    private boolean statusConta;

/*
 * To String
 */
    @Override
	public String toString() {
    	String c = "Conta [";
		
    	c += "numeroConta = " + numeroConta;
		c += ", nomeCliente = " + nomeCliente;
		c += ", saldoConta = " + saldoConta;
		c += "]";
		
    	return c;
	}
    
    
/*
 *    Construtor:
 */
    public Conta(int numeroConta, Agencia agencia, String banco, String senha) {
  		this.numeroConta = numeroConta;
  		this.agencia = agencia;
  		this.banco = banco;
  		this.senha = senha;
  		this.saldoConta = 0;
  		this.statusConta = false;
  		this.quantidadeUsuarios = 0;
  	}
    

/*
 *   Getters and Setters:
 */
	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		if (numeroConta > 0) {
            this.numeroConta = numeroConta;
        } else {
            this.numeroConta = 0;
        }
	}
	
	public int getQuantidadeUsuarios() {
		return quantidadeUsuarios;
	}

	public void setQuantidadeUsuarios(int quantidadeUsuarios) {
		this.quantidadeUsuarios = quantidadeUsuarios;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setNomeAgencia(Agencia agencia) {
		this.agencia = agencia;
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
		 if (saldoConta > 0) {
	            this.saldoConta = saldoConta;
	     }else{
	        	this.saldoConta = 0;
          }
	}

	public boolean getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}
	
	
/*
 * 	MÉTODOS PERSONALIZADOS
 */
	
/*
 * Abrir conta
 */
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
	
	
/*
 * Fechar conta
 */
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
	

/*
 * Depositar
 */
	public void depositar(double valor) {
		this.saldoConta += valor;
	}
	
	
/*
 * Sacar
 */
	public boolean sacar(double valor) {
		if((this.saldoConta - valor) >= 0) {
			this.saldoConta -= valor;
			return true;
		}
		return false;
	} 
	
	
/*
 * Validar a senha informada
 */
	public boolean validarSenha(String senha) {
        if (getSenha().equals(senha)) {
            return true;
        }
        return false;
    }
}