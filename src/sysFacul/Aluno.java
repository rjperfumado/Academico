package sysFacul;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Aluno { 
	
	public char[] nomeAluno;

	public void nomeAluno() throws IOException{
		
	String nome;

		
		Scanner nomeAluno1 = new Scanner(System.in);
		nome = nomeAluno1.next();	
		
			System.out.printf("Informe o nome do Aluno:",nomeAluno1);
			
		FileWriter cadastroAluno = new FileWriter("CadastroGeral.txt");
		PrintWriter gravarArq = new PrintWriter(cadastroAluno);   
		
		gravarArq.printf("Nome do Aluno:",nome);
		
		cadastroAluno.close();
		
	}
	
}
