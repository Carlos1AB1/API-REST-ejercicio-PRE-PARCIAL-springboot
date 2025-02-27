package org.archu.jobmanagement.repository;

import org.archu.jobmanagement.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
