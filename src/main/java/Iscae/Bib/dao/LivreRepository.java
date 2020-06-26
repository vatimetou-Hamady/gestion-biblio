package Iscae.Bib.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Iscae.Bib.entities.Auteur;
import Iscae.Bib.entities.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long>{

}
