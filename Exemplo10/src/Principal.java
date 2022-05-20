public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alunos aluno = new Alunos ();
		TelasInputAlunos telasInputAlunos = new TelasInputAlunos();
		
		TelasOutAlunos telasOutAlunos = new TelasOutAlunos();		
		
		aluno.mediaDosAlunos();
		telasInputAlunos.lerAluno();
		telasOutAlunos.exibirAlunos();
		
		
		
	}

}
