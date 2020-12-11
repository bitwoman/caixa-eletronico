
public class ContaCorrente extends Conta {
//	Atributos:
//	private static double CPMF = 0.38;	
	
//	Construtor:
	public ContaCorrente(int numeroConta, Agencia nomeAgencia, String banco, String senha) {
		super(numeroConta, nomeAgencia, banco, senha);
	}

//Sobreposição do método abrirConta herdado da classe Conta:
	@Override
	public void abrirConta(String tipoConta) {
		if(this.getStatusConta() == false) {
//A preferência do java é por equals(), todavia, '==' funciona.
			if(tipoConta == "CC") {
				this.setTipoConta(tipoConta);
				this.setStatusConta(true);
				this.setSaldoConta(50);
				
				System.out.println("Conta corrente aberta com sucesso!");
			}else {
				System.out.println("Conta não é corrente!");
			}
		}else {
			System.out.println("Conta já existe");
		}
}
	
/*	Método sobrescrito da classe Conta, pois, o saque realizado numa corrente
//	difere de um saque realizado numa conta poupança.
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
