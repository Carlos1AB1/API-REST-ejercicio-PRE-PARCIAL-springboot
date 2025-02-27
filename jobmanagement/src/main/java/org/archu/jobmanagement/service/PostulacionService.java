package org.archu.jobmanagement.service;

import org.archu.jobmanagement.model.Postulacion;
import org.archu.jobmanagement.repository.PostulacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostulacionService {

    @Autowired
    private PostulacionRepository postulacionRepository;

    public List<Postulacion> getAllPostulaciones() {
        return postulacionRepository.findAll();
    }

    public Optional<Postulacion> getPostulacionById(Long id) {
        return postulacionRepository.findById(id);
    }

    public Postulacion createPostulacion(Postulacion postulacion) {
        return postulacionRepository.save(postulacion);
    }

    public Postulacion updatePostulacion(Long id, Postulacion postulacionDetails) {
        Postulacion postulacion = postulacionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Postulacion no encontrada"));
        postulacion.setEstado(postulacionDetails.getEstado());
        postulacion.setComentarios(postulacionDetails.getComentarios());
        return postulacionRepository.save(postulacion);
    }

    public List<Postulacion> getPostulacionesByCandidato(Long candidatoId) {
        return postulacionRepository.findByCandidatoId(candidatoId);
    }

    public List<Postulacion> getPostulacionesByOferta(Long ofertaId) {
        return postulacionRepository.findByOfertaId(ofertaId);
    }
}
