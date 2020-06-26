package Iscae.Bib.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Iscae.Bib.entities.Auteur;
import Iscae.Bib.entities.Restitution;

public interface RestitutionRepository extends JpaRepository<Restitution, Long>{

}
