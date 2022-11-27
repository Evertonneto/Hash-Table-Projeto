package projeto;

public class Hash {
	int operador;                                       // Atributo operador
	     Lista[] vetor;                                      // Vetor de Listas
	 
	     Hash(int operador) {                                // Construtor iniciando com um operador
	         this.operador = operador;                       // Inicializa o operador
	         vetor = new Lista[operador];                    // Inicializa o vetor de Listas
	         for (int i = 0; i < operador; i++) {            // Para cada posicao no vetor
	            vetor[i] = new Lista();                     // Inicializa a Lista daquela posicao do vetor
	        }
	    }
	
	    void inserir(Aluno aluno) {                     // Metodo para inserir um contato
	        int chave = aluno.matricula % operador;          // Posicao = resto do codigo /operador
	        vetor[chave].inserir(aluno);                  // Insere o contato naquela lista
	    }
	
	    Aluno buscar(int matricula) {                        // Metodo buscar pelo codigo
	        return vetor[matricula % operador].buscar(matricula); // Busca apenas na lista especifica
	    }
	
	    public String toString() {                          // Sobrescreve o metodo toString
	        String out = "";                                // Cria uma string de saida
	        for(int i = 0; i < operador; i++) {             // Para cada posicao no vetor de Listas
	            out += "" + i + ": ";                       // adiciona uma string representando a Lista
	            out += vetor[i % operador] + "\n";
	        }
	        return out;                                     // Retorna a String
	    
	    }
	    
	    public void apaga(int chave) {
	        
	        if (buscar(chave) != null) {
	           vetor[chave % operador].apaga_lista(chave);
	        }
	        else System.out.println("\n Aluno não encontrado");
	      }
	    
	   
}
