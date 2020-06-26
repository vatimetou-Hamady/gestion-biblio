package Iscae.Bib.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Iscae.Bib.entities.Auteur;
import Iscae.Bib.entities.Penalite;

public interface PenaliteRepository extends JpaRepository<Penalite, Long>{

}
