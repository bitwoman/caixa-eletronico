import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
/*
 * 	Variaveis e atributos
 */	
		Scanner entradaDados = new Scanner(System.in);
		boolean statusLogin = false;
		String senha, conta;
		long nroConta;
		
		
/*
 * Array List de contas	
 */
		ArrayList <Conta> contas = new ArrayList<Conta>();
		
/*
 * 	Instanciando de classes > criação de objetos
 */	
		
/*
 * Clientes
 */
		ClienteFisico clienteF01 = new ClienteFisico(874587283, 504472831, 19);
	
/*
 * Agências
 */
		Agencia agencia01 = new Agencia("Bradesco01", 179);
		
/*
 * Contas
 */
		Conta conta01 = new Conta(1234, "CC", agencia01, "Brades", "92897543");
		Conta conta02 = new Conta(12345, "CP", agencia01, "BB", "928975435");
		
		contas.add(conta01);
		contas.add(conta02);
		
		System.out.println(" ============= BEM VINDO =============");
		System.out.println("Qual operação deseja realizar? \n");
		System.out.println(" [1] Fazer login;\n [2] Abrir conta;\n "
						 + "[3] Fechar conta;\n [4] Adicionar cliente a uma conta\n"
						 + "[5] Fazer logout\n [6] Sacar\n "
						 + "[7] Depositar\n [8] Transferir");
			
		int tipoOperacao = entradaDados.nextInt();
	
		while(true) {
			switch (tipoOperacao) {
		        case 1: 
		            System.out.println("Digite o número da conta: ");
		            nroConta = entradaDados.nextLong();
		            
		            System.out.println("Digite a sua senha: ");
		            senha = entradaDados.next();
		            
		            if(conta01.validarNroConta(nroConta)) {
		            	if(conta01.validarSenha(senha)) {
		            		statusLogin = true;
		            		System.out.println("Bem vind_!");
		            	}else {
		            		System.out.println("Senha incorreta!");
		            		statusLogin = false;
		            	}
		            }else {
		            	System.out.println("Número incorreto!");
		            	statusLogin = false;
		            }
		            
		            break;
		        case 2:
		            System.out.println("Qual tipo de conta?\n");
		        	String tipoConta = entradaDados.next();
		        	
		        	System.out.println("Escolha a sua senha: \n");
		        	senha = entradaDados.next();
		        	
		        	Conta conta03 = new Conta(12345, tipoConta, agencia01, "Brades", senha);
		        	contas.add(conta03);
		        	
		        	conta03.abrirConta(conta03.getTipoConta());
		   
		            break;
		        case 3:
		        	System.out.println("Fechar conta");
		        	System.out.println("\nDigite o número da conta: ");
		            nroConta = entradaDados.nextLong();
		            
		            System.out.println("\nDigite o número da senha: ");
		            senha = entradaDados.next();
		            
		            if(conta01.validarNroConta(nroConta)) {
		            	if(conta01.validarSenha(senha)) {
		            		conta01.fecharConta(nroConta);
		            		conta01.setStatusConta(false);
		            	}else {
		            		System.out.println("Senha incorreta!");
		            	}
		            } else {
		            	System.out.println("Número incorreto!");
		            }
		            
		            break;
		        case 4:
		        	System.out.println("Adicionar cliente a uma conta");
		        	
		        	if(conta01.clientes.size() <= 10) {
		        		conta01.adicionarCliente(clienteF01);
		        	} else {
		        		System.out.println("A conta nesta está lotada nesta agência, adicione em outra!");
		        	}
		        	
		        	break;
		        case 5:
		        	System.out.println("Deseja fazer logout? [S/N]");
		        	String a = entradaDados.next().toUpperCase();
		        	
		        	if(a == "S") {
		        		if(statusLogin == true) {
		        			statusLogin = false;
		        			System.out.println("Até mais.");
		        		}else {
		        			System.out.println("A conta não está logada.");
		        		}
		        	}else {
		        		System.out.println("Continue navegando..");
		        	}
		        	
		        	break;
		        case 6:
		        	System.out.println("Sacar");
		        	System.out.println("Deseja sacar? ");
		        	String s = entradaDados.next().toUpperCase();
		        	
		        	System.out.println("Qual o valor do saque? ");
		        	float valorSaque = entradaDados.nextFloat();
		        	
		        	if(s == "S") {
		        		conta01.sacar(conta01, valorSaque);
		        	}else {
		        		System.out.println("Bye");
		        	}
		        	
		        	break;
		        case 7:
		        	System.out.println("Depositar");
		        	System.out.println("Deseja depositar? ");
		        	String d = entradaDados.next().toUpperCase();
		        	
		        	if(d == "S") {
			        	System.out.println("Qual o tipo de depósito? Dinheiro [D] ou Cheque [C]? ");
			        	String tipoDeposito = entradaDados.next();
		        		
			        	if(tipoDeposito.equals("D")) {
			        		System.out.println("Qual o valor do depósito? ");
				        	float valorDeposito = entradaDados.nextFloat();
			        		
			        		conta01.depositar(conta01, valorDeposito);
			        	}else {
			        		if(tipoDeposito.equals("C")) {
			        			System.out.println("Qual o valor do depósito? ");
					        	String valorDepositoC = entradaDados.next();
			        			
					        	conta01.depositar(conta01, valorDepositoC);
					        }
			        	}
			        }else {
			        	System.out.println("Bye");
			        }
		        		
		        	break;
		        case 8:
		        	System.out.println("Transferência");
		        	System.out.println("Deseja transferir? ");
		        	String t = entradaDados.next().toUpperCase();
		        	
		        	if(t.equals("S")) {
		        		System.out.println("Qual o valor da transferência? ");
			        	float valorTransfer = entradaDados.nextFloat();
			        	
			        	conta01.transferir(conta01, conta02, valorTransfer);
		        	}else {
		        		System.out.println("Bye");
		        	}
		        	
		        	break;
			}	
			
			System.out.println("Deseja continuar? [S/N]");
			String sair = entradaDados.next().toUpperCase();
			
			if(sair.equals("N")) {
				System.out.println("Tchau..");
				
				for(int i = 0; i<=20; i++) {
			    	System.out.println("\n ");
			    }
				
				break;
			}else {
				continue;
			}
		}
	}
}
