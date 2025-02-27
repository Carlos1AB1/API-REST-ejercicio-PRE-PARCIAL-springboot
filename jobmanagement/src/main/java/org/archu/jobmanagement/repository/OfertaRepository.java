package org.archu.jobmanagement.repository;

import org.archu.jobmanagement.model.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfertaRepository extends JpaRepository<Oferta, Long> {
    List<Oferta> findByTituloContainingOrUbicacionContaining(String titulo, String ubicacion);
    List<Oferta> findByEmpresaId(Long empresaId);
}
