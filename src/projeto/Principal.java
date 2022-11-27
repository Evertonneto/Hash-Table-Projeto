package projeto;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) { 
		Scanner teclado = new Scanner(System.in);
		int tipo;
		String x = "s";
		Hash hash = new Hash(11);
	    System.out.println("");
	    
	    while(x == "s") {
	    System.out.println("Digite o número para escolher o tipo de ordenanação: ");
	    System.out.println("[1]: Inserir Aluno"); 
	    System.out.println("[2]: Buscar Aluno");  
	    System.out.println("[3]: Remover Aluno");  
	    System.out.println("[4]: Exibir tabela hash");  
	    System.out.println("[5]: Encerrar Sistema"); 
	    tipo = teclado.nextInt();
	    
	    switch(tipo) {
	    case 1:
	    	Scanner inserir = new Scanner(System.in);
	    	System.out.println("Digite o rgm do aluno:");
	    	int rgm = inserir.nextInt();
	    	inserir.nextLine(); // esvaziar buff 
	    	System.out.println("Digite o nome do aluno:");
	    	String nome = inserir.nextLine();
	    	System.out.println("Digite a idade do aluno:");
	    	int idade = inserir.nextInt();
	    	hash.inserir(new Aluno(rgm, nome , idade));
	    	break;
	    case 2:
	    	// Fazer Input
	    	Scanner buscar = new Scanner(System.in);
	    	System.out.println("Digite o rgm a ser procurado:");
	    	int valor = buscar.nextInt();
	    	
	    	System.out.println("Aluno Encontrado:" + hash.buscar(valor));
	    	break;
	    case 3:
	    	Scanner remover = new Scanner(System.in);
	    	System.out.println("Digite a matrícula do aluno a ser removido:");
	    	int rgmremovido = remover.nextInt();
	    	hash.apaga(rgmremovido);
	    	break;
	    case 4:
	    	System.out.println(hash);
	    	break;
	    case 5:
	    	x = "n";
	    	break;
	    default:
	    	System.out.println("Erro!");
	    }
	    Scanner pausa= new Scanner(System.in);
	    System.out.println("Digite qualquer tecla para continuar...");
	    pausa.nextLine();
	    
	    }
		                                                               
	}
		
}
