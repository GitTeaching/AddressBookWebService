package soa.ws.tp4;


public class Adresse {
	
	private String pays;
	private String email;
	
	public Adresse(String pays, String email) {
		this.setPays(pays);
		this.setEmail(email);
	}
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
