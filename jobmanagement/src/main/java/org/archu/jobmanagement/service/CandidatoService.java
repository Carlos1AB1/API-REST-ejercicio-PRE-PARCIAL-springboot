package org.archu.jobmanagement.service;

import org.archu.jobmanagement.model.Candidato;
import org.archu.jobmanagement.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public List<Candidato> getAllCandidatos() {
        return candidatoRepository.findAll();
    }

    public Optional<Candidato> getCandidatoById(Long id) {
        return candidatoRepository.findById(id);
    }

    public Candidato createCandidato(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    public Candidato updateCandidato(Long id, Candidato candidatoDetails) {
        Candidato candidato = candidatoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Candidato no encontrado"));
        candidato.setNombre(candidatoDetails.getNombre());
        candidato.setApellido(candidatoDetails.getApellido());
        candidato.setCorreoElectronico(candidatoDetails.getCorreoElectronico());
        candidato.setTelefono(candidatoDetails.getTelefono());
        candidato.setCv(candidatoDetails.getCv());
        candidato.setHabilidades(candidatoDetails.getHabilidades());
        candidato.setExperienciaLaboral(candidatoDetails.getExperienciaLaboral());
        candidato.setEducacion(candidatoDetails.getEducacion());
        return candidatoRepository.save(candidato);
    }

    public void deleteCandidato(Long id) {
        candidatoRepository.deleteById(id);
    }
}
