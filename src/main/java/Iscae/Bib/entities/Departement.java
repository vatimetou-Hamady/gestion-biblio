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
public class Departement implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long IdDeprt;
	public String nom;
	
	@OneToMany(mappedBy="departement", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Collection<Professeur> professeurs;

	public Long getIdDeprt() {
		return IdDeprt;
	}

	public void setIdDeprt(Long idDeprt) {
		IdDeprt = idDeprt;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Professeur> getProfesseurs() {
		return professeurs;
	}

	public void setProfesseurs(Collection<Professeur> professeurs) {
		this.professeurs = professeurs;
	}

	public Departement( String nom) {
		this.nom = nom;
		
	}
	
	
	
}
