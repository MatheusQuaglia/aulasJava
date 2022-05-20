

public class TelasOutAlunos {
	String nome;
	double media;
	TelasInputAlunos aluno = new TelasInputAlunos ();
	Alunos alun = new Alunos ();
	public void exibirAlunos() {
		System.out.println("Nome: " + aluno.nome +
				" com Média: " + alun.media);
	}
}
