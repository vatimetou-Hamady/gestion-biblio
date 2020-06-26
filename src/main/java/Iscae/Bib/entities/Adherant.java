package Iscae.Bib.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "IdAdherant")
public abstract class  Adherant extends Personne implements Serializable {
	
	@ManyToMany(mappedBy="adherants")
	 Collection<Exemplaire> exemplaire;
	
	 @Column(nullable=true)
	 @OneToMany(mappedBy="adherant", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		private Collection<Penalite> penalites;

	 
	 
	public Collection<Exemplaire> getExemplaire() {
		return exemplaire;
	}

	public void setExemplaire(Collection<Exemplaire> exemplaire) {
		this.exemplaire = exemplaire;
	}

	public Collection<Penalite> getPenalites() {
		return penalites;
	}

	public void setPenalites(Collection<Penalite> penalites) {
		this.penalites = penalites;
	}

	public Adherant(Long identite, String nom, String prenom, String email, int tel) {
		super( identite, nom, prenom, email, tel);
		
	}

	 
	
}
