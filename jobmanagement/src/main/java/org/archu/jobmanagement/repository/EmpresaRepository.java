package org.archu.jobmanagement.repository;

import org.archu.jobmanagement.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
