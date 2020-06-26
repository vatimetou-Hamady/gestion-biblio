package Iscae.Bib.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Editeur implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long IdEditeur;
	public String nom;
	
	
	
	 @OneToMany(mappedBy="editeur", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Collection<Ouvrage> ouvrages;


	public Long getIdEditeur() {
		return IdEditeur;
	}


	public void setIdEditeur(Long idEditeur) {
		IdEditeur = idEditeur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Ouvrage> getOuvrages() {
		return ouvrages;
	}


	public void setOuvrages(Collection<Ouvrage> ouvrages) {
		this.ouvrages = ouvrages;
	}


	public Editeur(String nom) {

		this.nom = nom;	
	}
	
	 
	
}
