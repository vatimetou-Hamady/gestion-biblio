package Iscae.Bib.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Iscae.Bib.entities.Auteur;
import Iscae.Bib.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

}
