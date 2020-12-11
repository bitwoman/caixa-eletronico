
public class ContaCorrente extends Conta {
//	Atributos:
//	private static double CPMF = 0.38;	
	
//	Construtor:
	public ContaCorrente(int numeroConta, Agencia nomeAgencia, String banco, String senha) {
		super(numeroConta, nomeAgencia, banco, senha);
	}

//Sobreposi��o do m�todo abrirConta herdado da classe Conta:
	@Override
	public void abrirConta(String tipoConta) {
		if(this.getStatusConta() == false) {
//A prefer�ncia do java � por equals(), todavia, '==' funciona.
			if(tipoConta == "CC") {
				this.setTipoConta(tipoConta);
				this.setStatusConta(true);
				this.setSaldoConta(50);
				
				System.out.println("Conta corrente aberta com sucesso!");
			}else {
				System.out.println("Conta n�o � corrente!");
			}
		}else {
			System.out.println("Conta j� existe");
		}
}
	
/*	M�todo sobrescrito da classe Conta, pois, o saque realizado numa corrente
//	difere de um saque realizado numa conta poupan�a.
	@Override
	public void sacarConta(float valor) {
//		super.sacarConta(valor);
		
		if(this.getStatusConta()) {
			if(this.getSaldoConta() >= getValor()) {
				this.setSaldoConta(this.getSaldoConta() - (valor + (valor * this.CPMF)));
				System.out.println("Saque realizado na conta de " + this.getNomeCliente());
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Conta fechada!");
		}
		
	}*/
}
