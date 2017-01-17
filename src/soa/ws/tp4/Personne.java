package soa.ws.tp4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Personne")
@XmlType(propOrder={"nom", "address"})
public class Personne {
	
	private String nom;
	private Adresse address;
	
	public Personne() {
		
	}
	
	public Personne(String nom, Adresse address) {
		this.setNom(nom);
		this.setAddress(address);
	}
	
	@XmlElement(name="NomPersonne")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@XmlElement(name="AdressePersonne")
	public Adresse getAddress() {
		return address;
	}

	public void setAddress(Adresse address) {
		this.address = address;
	}

}



