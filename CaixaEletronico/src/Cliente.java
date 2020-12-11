//Classe abstrata não pode ser instanciada, criada apenas para que 
//outras classes herdem seus atributos e métodos.

public abstract class Cliente {
//	Relacionamento de Associação: quando se tem um objeto como atributo de outro.
//	Cliente possui como atributo a classe Conta.
	
	protected Agencia nomeAgencia;
	protected Conta numeroConta, senha;
	
}
