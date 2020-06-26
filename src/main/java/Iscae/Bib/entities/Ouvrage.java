package Iscae.Bib.entities;

import java.io.Serializable;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;


@Entity
@Inheritance(strategy =InheritanceType.JOINED)
public class Ouvrage implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdOuvrage;
	@Column(unique=true)
	private Long ISBN;
	private String titre;
	@Temporal(TemporalType.DATE)
	public Date date_edition;
	private int nbrPage;
	private String cote;
	private boolean Est_emprente;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Auteur",
			joinColumns = @JoinColumn(name = "id_ouvrage"),
			inverseJoinColumns = @JoinColumn(name = "id_Personne"))
    private Collection<Personne> personnes;
	 
	 @OneToMany(mappedBy="ouvrage", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Collection<Exemplaire> exemplaires;
	 
	 @ManyToOne
		@JoinColumn(name="Id_editeur")
		private Editeur editeur;
	 
	 @ManyToOne
		@JoinColumn(name="Id_domaine")
		private Domaine domaine;

	public Long getIdOuvrage() {
		return IdOuvrage;
	}

	public void setIdOuvrage(Long idOuvrage) {
		IdOuvrage = idOuvrage;
	}

	public Long getISBN() {
		return ISBN;
	}

	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDate_edition() {
		return date_edition;
	}

	public void setDate_edition(Date date_edition) {
		this.date_edition = date_edition;
	}

	public int getNbrPage() {
		return nbrPage;
	}

	public void setNbrPage(int nbrPage) {
		this.nbrPage = nbrPage;
	}

	public String getCote() {
		return cote;
	}

	public void setCote(String cote) {
		this.cote = cote;
	}

	

	public boolean isEst_emprente() {
		return Est_emprente;
	}

	public void setEst_emprente(boolean est_emprente) {
		Est_emprente = est_emprente;
	}

	public Collection<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Collection<Personne> personnes) {
		this.personnes = personnes;
	}

	public Collection<Exemplaire> getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(Collection<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	public Ouvrage(Long iSBN, String titre, Date date_edition, int nbrPage, String cote, boolean est_emprente,
			Editeur editeur, Domaine domaine) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.date_edition = date_edition;
		this.nbrPage = nbrPage;
		this.cote = cote;
		Est_emprente = est_emprente;
		this.editeur = editeur;
		this.domaine = domaine;
	}
 
}
