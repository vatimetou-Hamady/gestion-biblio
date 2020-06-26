package Iscae.Bib.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Exemplaire implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdExemplaire;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_achat;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_entree;
	
	@ManyToOne
	@JoinColumn(name="Id_ouvrage")
	private Ouvrage ouvrage;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Emprente",
			joinColumns = @JoinColumn(name = "id_exemplaire"),
			inverseJoinColumns = @JoinColumn(name = "id_adherant"))
    private Collection<Adherant> adherants;
	
	@ManyToMany(mappedBy="Exemplaires")
	 Collection<Emprente> emprentes;

	public Long getIdExemplaire() {
		return IdExemplaire;
	}

	public void setIdExemplaire(Long idExemplaire) {
		IdExemplaire = idExemplaire;
	}

	public Date getDate_achat() {
		return date_achat;
	}

	public void setDate_achat(Date date_achat) {
		this.date_achat = date_achat;
	}

	public Date getDate_entree() {
		return date_entree;
	}

	public void setDate_entree(Date date_entree) {
		this.date_entree = date_entree;
	}

	public Ouvrage getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}

	public Collection<Adherant> getAdherants() {
		return adherants;
	}

	public void setAdherants(Collection<Adherant> adherants) {
		this.adherants = adherants;
	}

	public Collection<Emprente> getEmprentes() {
		return emprentes;
	}

	public void setEmprentes(Collection<Emprente> emprentes) {
		this.emprentes = emprentes;
	}

	public Exemplaire(Long idExemplaire, Date date_achat, Date date_entree, Ouvrage ouvrage) {

		this.date_achat = date_achat;
		this.date_entree = date_entree;
		this.ouvrage = ouvrage;

	}
	
	
}
