package org.archu.jobmanagement.service;

import org.archu.jobmanagement.model.Empresa;
import org.archu.jobmanagement.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> getAllEmpresas() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getEmpresaById(Long id) {
        return empresaRepository.findById(id);
    }

    public Empresa createEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Empresa updateEmpresa(Long id, Empresa empresaDetails) {
        Empresa empresa = empresaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada"));
        empresa.setNombre(empresaDetails.getNombre());
        empresa.setDescripcion(empresaDetails.getDescripcion());
        empresa.setSector(empresaDetails.getSector());
        empresa.setUbicacion(empresaDetails.getUbicacion());
        empresa.setCorreoContacto(empresaDetails.getCorreoContacto());
        return empresaRepository.save(empresa);
    }

    public void deleteEmpresa(Long id) {
        empresaRepository.deleteById(id);
    }
}
