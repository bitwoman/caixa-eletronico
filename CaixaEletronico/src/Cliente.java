//Classe abstrata n�o pode ser instanciada, criada apenas para que 
//outras classes herdem seus atributos e m�todos.

public abstract class Cliente {
//	Relacionamento de Associa��o: quando se tem um objeto como atributo de outro.
//	Cliente possui como atributo a classe Conta.
	
	protected Agencia nomeAgencia;
	protected Conta numeroConta, senha;
	
}
