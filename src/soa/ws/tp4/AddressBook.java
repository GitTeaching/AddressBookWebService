package soa.ws.tp4;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface AddressBook {

	@WebMethod
	@WebResult(name="adresseRetournee")
	public Adresse getAddresByName(@WebParam(name="nom")String nom);

	@WebMethod
	@WebResult(name="listePersonnes")
	public ArrayList<Personne> getPersons();
}
