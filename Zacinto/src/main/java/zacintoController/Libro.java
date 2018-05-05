package zacintoController;

public class Libro {

	private static int quantita=100;

	
	public static int calcoloQuantita() {
		
		return quantita--;
		
	}

	public static int getQuantita() {
		return quantita;
	}

	public static void setQuantita(int quantita) {
		Libro.quantita = quantita;
	}


	
}
