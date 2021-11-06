package tn.esprit.esponline;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.esponline.Service.EntrepriseService;
import tn.esprit.esponline.entity.Entreprise;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class EntrepriseSeriveceImplTest {
	
	@Autowired
	EntrepriseService entrepriseService;

	@Test
	@Order(1)
	public void testRetrieveAllEntreprise() {
		List<Entreprise> ListeEntreprise = entrepriseService.retrieveAllEntreprise();
		Assertions.assertEquals(12, ListeEntreprise.size());;
		
	}
	
	
	
	@Test
	@Order(2)
	public void testaddEntreprise() throws ParseException{
		Entreprise e = new Entreprise("tets","bekri");
		Entreprise entrepriseAdded = entrepriseService.addEntreprise(e);
		Assertions.assertEquals(e.getName(),entrepriseAdded.getName());
	
	
	}
		
	@Test
	@Order(3)
	public void testUpdateEntreprise() throws ParseException{
		Entreprise e = new Entreprise(11,"rafik","mastouri");
		Entreprise entrUpdated = entrepriseService.updateEntreprise(e);
		Assertions.assertEquals(e.getName(),entrUpdated.getName());

	}

	
	@Test
	@Order(4)
	public void testDeleteEntreprise(){
		entrepriseService.deleteEntreprise(12);
		Assertions.assertNull(entrepriseService.retrieveEntreprise(12));
		
	}
	
	@Test
	@Order(5)
	public void testRetrieveEntreprise(){
		Optional<Entreprise> entrepriseRetrieved = entrepriseService.retrieveEntreprise(1);
		Assertions.assertEquals(1, entrepriseRetrieved);
		
	}
	

}
