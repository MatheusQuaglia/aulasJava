package Discente;

public class Alunos {
	public String nome;
	public double nota1, nota2, nota3, media;
	
	TelasInputAlunos info = new TelasInputAlunos();
	
	public void mediaDosAlunos() {
		media = (info.nota1 + info.nota2 + info.nota3)/3;
		
	}

}
