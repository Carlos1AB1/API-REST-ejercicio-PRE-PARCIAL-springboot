package org.archu.jobmanagement.controller;

import org.archu.jobmanagement.model.Oferta;
import org.archu.jobmanagement.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ofertas")
public class OfertaController {

    @Autowired
    private OfertaService ofertaService;

    @GetMapping
    public List<Oferta> getAllOfertas() {
        return ofertaService.getAllOfertas();
    }

    @GetMapping("/{id}")
    public Optional<Oferta> getOfertaById(@PathVariable Long id) {
        return ofertaService.getOfertaById(id);
    }

    @PostMapping
    public Oferta createOferta(@RequestBody Oferta oferta) {
        return ofertaService.createOferta(oferta);
    }

    @PutMapping("/{id}")
    public Oferta updateOferta(@PathVariable Long id, @RequestBody Oferta ofertaDetails) {
        return ofertaService.updateOferta(id, ofertaDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteOferta(@PathVariable Long id) {
        ofertaService.deleteOferta(id);
    }

    @GetMapping("/empresa/{empresaId}")
    public List<Oferta> getOfertasByEmpresa(@PathVariable Long empresaId) {
        return ofertaService.getOfertasByEmpresa(empresaId);
    }
}
