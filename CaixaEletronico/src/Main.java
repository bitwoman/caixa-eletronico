
public class Main {

	public static void main(String[] args) {
		
		ClienteFisico cliente = new ClienteFisico(874587283, 504472831, 19);
		Agencia agencia = new Agencia("Bradesco01", 179);
		Conta conta = new Conta(1234, agencia, "Brades", "92897543");
		
		
		conta.adicionarCliente(cliente);
		
		
		
		
		


	}

}
