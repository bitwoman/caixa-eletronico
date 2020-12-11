
public class ContaPoupanca extends Conta {

//Construtor:
	public ContaPoupanca(int numeroConta, Agencia nomeAgencia, String banco, String senha) {
		super(numeroConta, nomeAgencia, banco, senha);
	}

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
}
