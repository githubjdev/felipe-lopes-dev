package felipe.dev.array;

public class AlunoMain {

	public static void main(String[] args) {

		Aluno[] aluno = new Aluno[3];
		
		aluno[0] = new Aluno("João", 15);
		aluno[1] = new Aluno("Alex", 38);
		aluno[2] = new Aluno("Maria", 25);
		
		
		for (Aluno aln : aluno) {
			 aln.mostrar();
		}
		
		
		
	}

}
