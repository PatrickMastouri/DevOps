package tn.esprit.esponline.Service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.Repository.EntrepriseRepository;
import tn.esprit.esponline.entity.Entreprise;
@Service
public class EntrepriseServiceImpl implements EntrepriseService {
	
	
	@Autowired
	EntrepriseRepository entrepriseRepository;
	
	
	private static final Logger L = LogManager.getLogger(EntrepriseServiceImpl.class);


	@Override
	public List<Entreprise> retrieveAllEntreprise() {
		List<Entreprise> entreprise = null; 
		try {
	
			// TODO Log deja ajouter en début de la méthode 
			L.info("in method retive all Entreprises");
			entreprise = (List<Entreprise>) entrepriseRepository.findAll(); 
			L.debug("Connection a la BD");
			for (Entreprise entr : entreprise) {
				L.debug("Entreprise:" + entr.getName());

				// TODO Log deja ajouter pour affiher chaque user dans les logs   
			} 
			
			L.info("out method retive all Entreprise");

			// TODO Log deja ajouter à la fin de la méthode 
		}catch (Exception e) {
			
			L.error("out of method: " + e);

			// TODO Log deja ajouter pour gérer les erreurs 
		}

		return entreprise;
	}

	@Override
	public Entreprise addEntreprise(Entreprise a) {

		// TODO Log à ajouter en début de la méthode 
		L.info("In methode addEntr");

		Entreprise e_saved = entrepriseRepository.save(a); 
				// TODO Log à ajouter à la fin de la méthode 
				L.info("Out methode addEntr");

				return e_saved; 
	}

	@Override
	public void deleteEntreprise(long id) {
		// TODO Log à ajouter en début de la méthode 
		entrepriseRepository.deleteById(id); 
		// TODO Log à ajouter à la fin de la méthode 


	}

	@Override
	public Entreprise updateEntreprise(Entreprise a) {
		// TODO Log à ajouter en début de la méthode 
		L.info("In methode updateEntr");

		Entreprise e_saved = entrepriseRepository.save(a); 
				// TODO Log à ajouter à la fin de la méthode 
				L.info("Out methode updateEntr");

				return e_saved; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Override
	public Entreprise retrieveEntreprise(long id) {
		L.info("In methode retrieventre");
		
		Entreprise e =  entrepriseRepository.findById(id).orElse(new Entreprise());
		//Entreprise u =  entrepriseRepository.findById((id)).get(); 
		L.info("out methode retrieveEntr");
		return e; 
	}
*/

		


}
