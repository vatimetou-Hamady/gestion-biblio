package Iscae.Bib.entities;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Auteur implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdAuteur;
	private Long id_ouvrage;
	private Long id_Personne;
	
	public Long getIdAuteur() {
		return IdAuteur;
	}
	public void setIdAuteur(Long idAuteur) {
		IdAuteur = idAuteur;
	}
	public Long getId_ouvrage() {
		return id_ouvrage;
	}
	public void setId_ouvrage(Long id_ouvrage) {
		this.id_ouvrage = id_ouvrage;
	}
	public Long getId_Personne() {
		return id_Personne;
	}
	public void setId_Personne(Long id_Personne) {
		this.id_Personne = id_Personne;
	}
	public Auteur(Long id_ouvrage, Long id_Personne) {
		super();
		this.id_ouvrage = id_ouvrage;
		this.id_Personne = id_Personne;
	}
	
	
	
}
