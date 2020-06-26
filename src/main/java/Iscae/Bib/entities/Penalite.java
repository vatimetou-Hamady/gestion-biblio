package Iscae.Bib.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Penalite implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPenalite;
	private String NaturePenalite;
	@Temporal(TemporalType.TIMESTAMP)
	public Date date_Penalite;
	
	@ManyToOne
	@JoinColumn(name="Id_adherant")
	private Adherant adherant;
	
	@ManyToOne
	@JoinColumn(name="Id_Emprente")
	private Emprente Emprente;

	public Long getIdPenalite() {
		return IdPenalite;
	}

	public void setIdPenalite(Long idPenalite) {
		IdPenalite = idPenalite;
	}

	public String getNaturePenalite() {
		return NaturePenalite;
	}

	public void setNaturePenalite(String naturePenalite) {
		NaturePenalite = naturePenalite;
	}

	public Adherant getAdherant() {
		return adherant;
	}

	public void setAdherant(Adherant adherant) {
		this.adherant = adherant;
	}

	public Penalite(String naturePenalite, Date date_Penalite, Adherant adherant,Emprente emprente) {
		super();
		NaturePenalite = naturePenalite;
		this.date_Penalite = date_Penalite;
		this.adherant = adherant;
		this.Emprente= emprente;
	}

	
}
