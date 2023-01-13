package br.com.estudandoemcasa.clinica.repository;

import br.com.estudandoemcasa.clinica.entities.DoutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoutorRepository extends JpaRepository<DoutorEntity, Long> {
}
