package Iscae.Bib.entities;


import javax.persistence.Id;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "IdLivre")
public class Livre extends Ouvrage implements Serializable {

	public Livre(Long iSBN, String titre, Date date_edition, int nbrPage, String cote, boolean emprente, Editeur editeur, Domaine domaine) {
		super(iSBN, titre, date_edition, nbrPage, cote, emprente, editeur, domaine);
		// TODO Auto-generated constructor stub
	}

	
}
