package org.archu.jobmanagement.controller;

import org.archu.jobmanagement.model.Postulacion;
import org.archu.jobmanagement.service.PostulacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/postulaciones")
public class PostulacionController {

    @Autowired
    private PostulacionService postulacionService;

    @GetMapping
    public List<Postulacion> getAllPostulaciones() {
        return postulacionService.getAllPostulaciones();
    }

    @GetMapping("/{id}")
    public Optional<Postulacion> getPostulacionById(@PathVariable Long id) {
        return postulacionService.getPostulacionById(id);
    }

    @PostMapping
    public Postulacion createPostulacion(@RequestBody Postulacion postulacion) {
        return postulacionService.createPostulacion(postulacion);
    }

    @PutMapping("/{id}")
    public Postulacion updatePostulacion(@PathVariable Long id, @RequestBody Postulacion postulacionDetails) {
        return postulacionService.updatePostulacion(id, postulacionDetails);
    }

    @GetMapping("/candidato/{candidatoId}")
    public List<Postulacion> getPostulacionesByCandidato(@PathVariable Long candidatoId) {
        return postulacionService.getPostulacionesByCandidato(candidatoId);
    }

    @GetMapping("/oferta/{ofertaId}")
    public List<Postulacion> getPostulacionesByOferta(@PathVariable Long ofertaId) {
        return postulacionService.getPostulacionesByOferta(ofertaId);
    }
}
