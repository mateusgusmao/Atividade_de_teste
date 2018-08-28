public class Main {

	public static void teste() {
		// Cen�rio
		Aluno a = new Aluno();
		Secretaria s = new Secretaria();
		
		// A��o
		double media = s.media(a);
		//Verifica��o
		//System.out.println(media);
		a.avaliar(2, 8);
		a.recuperar(4);
		
	}

}
