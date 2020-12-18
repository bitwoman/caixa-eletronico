import java.util.ArrayList;

public class Agencia {
/*
 * Atributos
 */
	private String nomeAgencia;
	private int numeroAgencia;

/*
 * Array list de Agencias
 */
	 ArrayList <Agencia> agencias = new ArrayList<Agencia>();
	
		
/*
 * Construtor
 */
	public Agencia(String nomeAgencia, int numeroAgencia) {
		this.nomeAgencia = nomeAgencia;
		this.numeroAgencia = numeroAgencia;
	}
	

/*
 * Getters and Setters
 */
	public String getNomeAgencia() {
		return nomeAgencia;
	}


	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}


	public int getNumeroAgencia() {
		return numeroAgencia;
	}


	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	
/*
 * 	MÉTODOS PERSONALIZADOS
 */
	
/*
 * Adicionar Agencia
 */
	public void adicionarAgencia(Agencia agencia) {
    	agencias.add(agencia);
    }
}
