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
public class Domaine implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long IdDomaine;
	public String nom;
	
	@OneToMany(mappedBy="domaine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Collection<Ouvrage> Ouvrages;

	public Long getIdDomaine() {
		return IdDomaine;
	}

	public void setIdDomaine(Long idDomaine) {
		IdDomaine = idDomaine;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Ouvrage> getOuvrages() {
		return Ouvrages;
	}

	public void setOuvrages(Collection<Ouvrage> ouvrages) {
		Ouvrages = ouvrages;
	}

	public Domaine(String nom) {
		
		this.nom = nom;
	}
	
	
}
