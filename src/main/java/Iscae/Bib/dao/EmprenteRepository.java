package Iscae.Bib.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Iscae.Bib.entities.Auteur;
import Iscae.Bib.entities.Emprente;

public interface EmprenteRepository extends JpaRepository<Emprente, Long>{

}
