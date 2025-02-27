package org.archu.jobmanagement.repository;

import org.archu.jobmanagement.model.Postulacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostulacionRepository extends JpaRepository<Postulacion, Long> {
    List<Postulacion> findByCandidatoId(Long candidatoId);
    List<Postulacion> findByOfertaId(Long ofertaId);
}
