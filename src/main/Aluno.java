public class Aluno {
	
	protected  String nome;
	protected double notas [ ] = new double [4];
	
	public void avaliar(int unidade, double nota) {
		notas[unidade-1] = nota;
		System.out.println("A nota da unidade "+unidade+" �: "+nota);
	}
	
	public void recuperar(int unidade) {		
		int i = unidade - 1;
		if(notas[i]==0.0)
			System.out.println("A unidade "+unidade+" n�o possui nota.");
		else
		System.out.println(notas[i]);
	}
}