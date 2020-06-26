package Iscae.Bib.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy =InheritanceType.JOINED)
public class Personne {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPers;
	private Long identite;
	private String nom;
	private String prenom;
	private String email;
	private int Tel;
	
	
	@ManyToMany(mappedBy="personnes")
	 Collection<Ouvrage> ouvrages;

	public Long getIdPers() {
		return IdPers;
	}

	public void setIdPers(Long idPers) {
		IdPers = idPers;
	}

	public Long getIdentite() {
		return identite;
	}

	public void setIdentite(Long identite) {
		this.identite = identite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Ouvrage> getOuvrages() {
		return ouvrages;
	}

	public void setOuvrage(Collection<Ouvrage> ouvrages) {
		this.ouvrages = ouvrages;
	}

	public int getTel() {
		return Tel;
	}

	public void setTel(int tel) {
		Tel = tel;
	}

	public Personne(Long identite, String nom, String prenom, String email, int tel) {
		super();
		this.identite = identite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		Tel = tel;
		
	}

	
	
	
	
	
	
	
	 
}
