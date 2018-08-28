
public class Secretaria {
	
	Aluno aluno = new Aluno();
	double soma = 0;
	public double media(Aluno aluno) {
		for(int i=0; i<aluno.notas.length; i++) {
			 soma += aluno.notas[i];
		}
		return (soma/4);
	}
}