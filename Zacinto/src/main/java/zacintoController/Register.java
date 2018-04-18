package zacintoController;

public class Register {
	
	private String nome;
	private String cognome;
	private String email;
	private String telefono;
	private String sesso;
	private String password;
	
	private int eta;

	public Register(String nome, String cognome, String email, String telefono, String sesso, String password,
			int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
		this.sesso = sesso;
		this.password = password;
		this.eta = eta;
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Register [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", telefono=" + telefono
				+ ", sesso=" + sesso + ", password=" + password + ", eta=" + eta + "]";
	}	

	

}
