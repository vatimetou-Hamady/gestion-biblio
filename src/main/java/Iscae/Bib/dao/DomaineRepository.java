package Iscae.Bib.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Iscae.Bib.entities.Auteur;
import Iscae.Bib.entities.Domaine;

public interface DomaineRepository extends JpaRepository<Domaine, Long>{

}
