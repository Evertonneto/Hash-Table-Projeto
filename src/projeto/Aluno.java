package projeto;

public class Aluno {                                
	  int matricula;                                            
	  String nome;                                        
	  int idade;                                    

	  Aluno(int matricula, String nome, int idade) {    
	    this.matricula = matricula;                        
	    this.nome = nome;                                
	    this.idade = idade;                    
	  }

	  public String toString() {                        
	  return "(" + matricula + ", " + nome + "," + idade + ")";
	  }
	  };
