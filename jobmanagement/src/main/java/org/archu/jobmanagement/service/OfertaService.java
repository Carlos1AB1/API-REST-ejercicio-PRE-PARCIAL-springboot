package org.archu.jobmanagement.service;

import org.archu.jobmanagement.model.Oferta;
import org.archu.jobmanagement.repository.OfertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfertaService {

    @Autowired
    private OfertaRepository ofertaRepository;

    public List<Oferta> getAllOfertas() {
        return ofertaRepository.findAll();
    }

    public Optional<Oferta> getOfertaById(Long id) {
        return ofertaRepository.findById(id);
    }

    public Oferta createOferta(Oferta oferta) {
        return ofertaRepository.save(oferta);
    }

    public Oferta updateOferta(Long id, Oferta ofertaDetails) {
        Oferta oferta = ofertaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Oferta no encontrada"));
        oferta.setTitulo(ofertaDetails.getTitulo());
        oferta.setDescripcion(ofertaDetails.getDescripcion());
        oferta.setSalarioMin(ofertaDetails.getSalarioMin());
        oferta.setSalarioMax(ofertaDetails.getSalarioMax());
        oferta.setRequisitos(ofertaDetails.getRequisitos());
        oferta.setTipoJornada(ofertaDetails.getTipoJornada());
        oferta.setModalidad(ofertaDetails.getModalidad());
        oferta.setUbicacion(ofertaDetails.getUbicacion());
        oferta.setFechaPublicacion(ofertaDetails.getFechaPublicacion());
        oferta.setFechaExpiracion(ofertaDetails.getFechaExpiracion());
        oferta.setEstado(ofertaDetails.getEstado());
        return ofertaRepository.save(oferta);
    }

    public void deleteOferta(Long id) {
        ofertaRepository.deleteById(id);
    }

    public List<Oferta> getOfertasByEmpresa(Long empresaId) {
        return ofertaRepository.findByEmpresaId(empresaId);
    }
}
