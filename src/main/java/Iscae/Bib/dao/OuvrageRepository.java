package Iscae.Bib.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Iscae.Bib.entities.Auteur;
import Iscae.Bib.entities.Ouvrage;

public interface OuvrageRepository extends JpaRepository<Ouvrage, Long>{

}
