package org.archu.jobmanagement.controller;

import org.archu.jobmanagement.model.Candidato;
import org.archu.jobmanagement.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @GetMapping
    public List<Candidato> getAllCandidatos() {
        return candidatoService.getAllCandidatos();
    }

    @GetMapping("/{id}")
    public Optional<Candidato> getCandidatoById(@PathVariable Long id) {
        return candidatoService.getCandidatoById(id);
    }

    @PostMapping
    public Candidato createCandidato(@RequestBody Candidato candidato) {
        return candidatoService.createCandidato(candidato);
    }

    @PutMapping("/{id}")
    public Candidato updateCandidato(@PathVariable Long id, @RequestBody Candidato candidatoDetails) {
        return candidatoService.updateCandidato(id, candidatoDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidato(@PathVariable Long id) {
        candidatoService.deleteCandidato(id);
    }
}
