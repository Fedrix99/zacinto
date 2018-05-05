package zacintoController;

public class Utente {
	private int id;
	private String nome = "";
	private String cognome;
	private String email;
	private String telefono;
	private String sesso;
	private String password;
	private String eta;
	
	public Utente() {
		
		
	}
	
	public Utente(int id, String nome, String cognome, String email, String telefono, String sesso, String password,
			String eta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
		this.sesso = sesso;
		this.password = password;
		this.eta = eta;
	}
	public int getId() {
		return id;
	}
	public int setId(int id) {
		return this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
		

	
}
