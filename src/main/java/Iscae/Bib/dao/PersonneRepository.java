package Iscae.Bib.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Iscae.Bib.entities.Personne;
import Iscae.Bib.entities.Personnel;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
