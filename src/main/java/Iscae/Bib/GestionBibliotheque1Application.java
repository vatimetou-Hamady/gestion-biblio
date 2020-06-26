package Iscae.Bib;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Iscae.Bib.dao.AuteurRepository;
import Iscae.Bib.dao.DomaineRepository;
import Iscae.Bib.dao.EditeurRepository;
import Iscae.Bib.dao.OuvrageRepository;
import Iscae.Bib.dao.PersonneRepository;
import Iscae.Bib.entities.Auteur;
import Iscae.Bib.entities.Domaine;
import Iscae.Bib.entities.Editeur;
import Iscae.Bib.entities.Ouvrage;
import Iscae.Bib.entities.Personne;

@SpringBootApplication
public class GestionBibliotheque1Application implements CommandLineRunner{   //cette implementation de cette interface permet de tester dans la meme class et obligne de redefinir la methode run de cette interface{

	@Autowired
	private OuvrageRepository ouvrageRepository ;
	
	@Autowired
	private EditeurRepository editeurRepository ;
	
	@Autowired
	private DomaineRepository domaineRepository ;
	
	@Autowired
	private PersonneRepository personneRepository ;
	
	@Autowired
	private AuteurRepository auteurRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionBibliotheque1Application.class, args);
	}


	
	@Override  //annotation averride puisqu 'elle est de l'interfaceCommandLineRunner et sa redefinition est obligatoire ----->  ceci permet de faire le test dans cette methode
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// ici, la methode save d'EditeurRepository qui extends de JpaRepository<Editeur,Long>  enregistre un Editeur dans la base et en plus retourne l'editeur enregistrer
		Editeur editeur1=editeurRepository.save(new Editeur("editeurABC"));
	    
		Domaine domaine1=domaineRepository.save(new Domaine("Maths"));
	    
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Ouvrage OUVRAGE1=ouvrageRepository.save(new Ouvrage((long) 8,"titre1",df.parse("12/06/2020"),150,"cote1",true, editeur1, domaine1));
		
		Personne per1=personneRepository.save(new Personne((long)  89987645,"Ahmed","sidi","ahmed@gmail.com",87654433));
		
		auteurRepository.save(new Auteur(OUVRAGE1.getIdOuvrage(), per1.getIdPers()));
		
		
	}

}
