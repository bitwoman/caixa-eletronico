import java.util.Calendar;

public class ContaPoupanca extends Conta {
/*
 * Atributos	
 */
	private int diaRendimento;
	
//	Recursivo:
	/*public void sacar() {
		
	}*/
	
	
/*
 * To String
 */
	@Override
	public String toString() {
		String c = "Conta Poupança [";
		
		c += ", diaRendimento = " + diaRendimento;
    	c += super.toString();
		c += "]";
		
    	return c;
	}	
	
	
/*
 * Construtor:
 */
	public ContaPoupanca(int numeroConta, Agencia nomeAgencia, String banco, String senha) {
		super(numeroConta, nomeAgencia, banco, senha);
	}


/*
 * Getters and Setters
 */
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	
/*
 * MÉTODOS PERSONALIZADOS
 */

/*	
 * Polimorfismo do método abrirConta herdado da classe Conta.
 * O polimorfismo de sobreposição (override) nos permite reescrever 
 * nas classes filhas, todavia, os métodos que serão sobrepostos, 
 * devem possuir a mesma assinatura da classe Mãe.
 */	
	@Override
	public void abrirConta(String tipoConta) {		
		if(this.getStatusConta() == false) {
		//A preferência do java é por equals(), todavia, '==' funciona.
			if(tipoConta == "CP") {
				this.setTipoConta(tipoConta);
				this.setStatusConta(true);
				this.setSaldoConta(150);
						
				System.out.println("Conta poupança aberta com sucesso!");
			}else {
				System.out.println("Conta não é poupança!");
			}
		}else {
			System.out.println("Conta já existe");
		}
	}
	

/*
 * Calcular novo saldo da conta poupança	
 */
	public boolean apresentarNovoSaldo(double taxaRendimento) {
		Calendar hoje  = Calendar.getInstance();
		
		if(taxaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldoConta(this.getSaldoConta() + (this.getSaldoConta() * taxaRendimento));
			return true;
		}else {
			return false;
		}
	}

}
