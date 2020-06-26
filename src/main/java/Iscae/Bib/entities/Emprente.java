  package Iscae.Bib.entities;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Emprente implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdEmprente;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_debut;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_rt_prevu;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_rt;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Restitution",
			joinColumns = @JoinColumn(name = "id_emprent"),
			inverseJoinColumns = @JoinColumn(name = "id_exemplaire"))
    private Collection<Exemplaire> Exemplaires;
	 
	 @Column(nullable=true)
	 @OneToMany(mappedBy="Emprente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		private Collection<Penalite> penalites;


	public Long getIdEmprente() {
		return IdEmprente;
	}

	public void setIdEmprente(Long idEmprente) {
		IdEmprente = idEmprente;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_rt_prevu() {
		return date_rt_prevu;
	}

	public void setDate_rt_prevu(Date date_rt_prevu) {
		this.date_rt_prevu = date_rt_prevu;
	}

	public Date getDate_rt() {
		return date_rt;
	}

	public void setDate_rt(Date date_rt) {
		this.date_rt = date_rt;
	}

	public Collection<Exemplaire> getExemplaires() {
		return Exemplaires;
	}

	public void setExemplaires(Collection<Exemplaire> exemplaires) {
		Exemplaires = exemplaires;
	}

	public Emprente(Date date_debut, Date date_rt_prevu, Date date_rt) {
		
		this.date_debut = date_debut;
		this.date_rt_prevu = date_rt_prevu;
		this.date_rt = date_rt;
		
	}
	
	
}
