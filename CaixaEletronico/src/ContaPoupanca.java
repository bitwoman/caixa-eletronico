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
		String c = "Conta Poupan�a [";
		
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
 * M�TODOS PERSONALIZADOS
 */

/*	
 * Polimorfismo do m�todo abrirConta herdado da classe Conta.
 * O polimorfismo de sobreposi��o (override) nos permite reescrever 
 * nas classes filhas, todavia, os m�todos que ser�o sobrepostos, 
 * devem possuir a mesma assinatura da classe M�e.
 */	
	@Override
	public void abrirConta(String tipoConta) {		
		if(this.getStatusConta() == false) {
		//A prefer�ncia do java � por equals(), todavia, '==' funciona.
			if(tipoConta == "CP") {
				this.setTipoConta(tipoConta);
				this.setStatusConta(true);
				this.setSaldoConta(150);
						
				System.out.println("Conta poupan�a aberta com sucesso!");
			}else {
				System.out.println("Conta n�o � poupan�a!");
			}
		}else {
			System.out.println("Conta j� existe");
		}
	}
	

/*
 * Calcular novo saldo da conta poupan�a	
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
