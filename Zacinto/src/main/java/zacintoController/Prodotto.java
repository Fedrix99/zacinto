package zacintoController;

public class Prodotto {

	private int id;
	private String nomeProdotto;
	private String genere;
	private int eta;
	private String autore;
	
	
	
	public Prodotto(int id, String nomeProdotto, String genere, int eta, String autore) {
		super();
		this.id = id;
		this.nomeProdotto = nomeProdotto;
		this.genere = genere;
		this.eta = eta;
		this.autore = autore;
	}
	
	public Prodotto() {
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeProdotto() {
		return nomeProdotto;
	}
	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	
	
}
