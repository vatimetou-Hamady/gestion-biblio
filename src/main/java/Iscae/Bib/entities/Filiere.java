package Iscae.Bib.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Filiere implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long IdFiliere;
	@Column(unique=true)
	public String nom;

	@OneToMany(mappedBy="filiere", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Collection<Etudiant> etudiants;

	public Long getIdFiliere() {
		return IdFiliere;
	}

	public void setIdFiliere(Long idFiliere) {
		IdFiliere = idFiliere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public Filiere(String nom) {
		this.nom = nom;	
	}

	
}
