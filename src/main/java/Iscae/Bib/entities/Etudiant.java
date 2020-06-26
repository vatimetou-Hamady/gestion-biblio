package Iscae.Bib.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "IdEtudiant")
public class Etudiant extends Adherant implements Serializable {
	
	@Column(unique=true)
	private Long matricule;

	
	@ManyToOne
	@JoinColumn(name="Id_filiere")
	private Filiere filiere;


	public Long getMatricule() {
		return matricule;
	}


	public void setMatricule(Long matricule) {
		this.matricule = matricule;
	}


	public Filiere getFiliere() {
		return filiere;
	}


	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}


	public Etudiant(Long idPers, Long identite, String nom, String prenom, String email, int tel,
			Long matricule, Filiere filiere) {
		super(identite, nom, prenom, email, tel);
		this.matricule = matricule;
		this.filiere = filiere;
	}


}
