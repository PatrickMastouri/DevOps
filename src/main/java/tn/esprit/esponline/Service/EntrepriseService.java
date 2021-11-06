package tn.esprit.esponline.Service;

import java.util.List;
import java.util.Optional;

import tn.esprit.esponline.entity.Entreprise;


public interface EntrepriseService {
	List<Entreprise> retrieveAllEntreprise(); 
	Entreprise addEntreprise(Entreprise a);
	void deleteEntreprise(long id);
	Entreprise updateEntreprise(Entreprise a);
	Optional<Entreprise> retrieveEntreprise(long id);

}
