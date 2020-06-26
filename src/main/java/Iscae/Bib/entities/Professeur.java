package Iscae.Bib.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "IdProfesseur")
public class Professeur extends Adherant implements Serializable{

	
	@ManyToOne
	@JoinColumn(name="Id_departement")
	private Departement departement;

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Professeur(Long identite, String nom, String prenom, String email, int tel, Departement departement) {
		super(identite, nom, prenom, email, tel);
		this.departement = departement;
	}

	
}
