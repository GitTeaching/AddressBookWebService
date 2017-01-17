package soa.ws.tp4;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="soa.ws.tp4.AddressBook")
public class AddressBookImpl implements AddressBook{
	
	ArrayList<Personne> persons = new ArrayList<Personne>();
	
	public AddressBookImpl () {
		persons.add(new Personne("Blabla", new Adresse("Algeria", "algeria.dz")));
		persons.add(new Personne("Bla", new Adresse("Spain", "spain.es")));
	}

	
	@Override
	@WebMethod
	public ArrayList<Personne> getPersons() {
		return persons;		
	}

	@Override
	@WebMethod
	public Adresse getAddresByName(String nom) {
		for(int i=0; i<persons.size(); i++)
			if(nom.equals(persons.get(i).getNom()))
				return persons.get(i).getAddress();
		return null;
	}

}
