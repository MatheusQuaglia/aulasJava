
import java.util.Scanner;

public class TelasInputAlunos {
	
	public Scanner input = new Scanner (System.in);
	public String nome; 
	public double nota1, nota2, nota3;
	
	public void lerAluno() {
		System.out.println ("Digite o nome do Aluno: " );
		nome = input.next();
		
		System.out.println("digite nota 1: ");
		nota1 = input.nextDouble();
		
		System.out.println("digite nota 2: ");
		nota1 = input.nextDouble();
		
		System.out.println("digite nota 3: ");
		nota1 = input.nextDouble();
		
	}
		
	}


