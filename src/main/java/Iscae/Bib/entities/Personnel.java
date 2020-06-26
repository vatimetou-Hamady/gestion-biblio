package Iscae.Bib.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "IdPersonnel")
public class Personnel extends Adherant implements Serializable {
 

	private String Fonction;

	public String getFonction() {
		return Fonction;
	}

	public void setFonction(String fonction) {
		Fonction = fonction;
	}

	public Personnel(Long identite, String nom, String prenom, String email, int tel, String fonction) {
		super(identite, nom, prenom, email, tel);
		Fonction = fonction;
	}

	

		
}
