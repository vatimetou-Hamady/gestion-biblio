package Iscae.Bib.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Restitution implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdRestitution;
	@Temporal(TemporalType.TIMESTAMP)
	public Date date_restitution;
	public Long getIdRestitution() {
		return IdRestitution;
	}
	public void setIdRestitution(Long idRestitution) {
		IdRestitution = idRestitution;
	}
	public Date getDate_restitution() {
		return date_restitution;
	}
	public void setDate_restitution(Date date_restitution) {
		this.date_restitution = date_restitution;
	}
	public Restitution(Long idRestitution, Date date_restitution) {
		super();
		IdRestitution = idRestitution;
		this.date_restitution = date_restitution;
	}
	
	
}
