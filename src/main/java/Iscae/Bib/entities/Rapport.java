package Iscae.Bib.entities;


import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "IdRapport")
public class Rapport extends Ouvrage implements Serializable{

	
	private String type;
	

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Rapport(Long iSBN, String titre, java.util.Date date_edition, int nbrPage, String cote, boolean est_emprente,
			Editeur editeur, Domaine domaine, String type) {
		super(iSBN, titre, date_edition, nbrPage, cote, est_emprente, editeur, domaine);
		this.type = type;
	}
	
}
