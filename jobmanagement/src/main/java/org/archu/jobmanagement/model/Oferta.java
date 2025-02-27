package org.archu.jobmanagement.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Oferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;
    private double salarioMin;
    private double salarioMax;
    private String requisitos;
    private String tipoJornada;
    private String modalidad;
    private String ubicacion;

    @Temporal(TemporalType.DATE)
    private Date fechaPublicacion;

    @Temporal(TemporalType.DATE)
    private Date fechaExpiracion;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalarioMin() {
        return salarioMin;
    }

    public void setSalarioMin(double salarioMin) {
        this.salarioMin = salarioMin;
    }

    public double getSalarioMax() {
        return salarioMax;
    }

    public void setSalarioMax(double salarioMax) {
        this.salarioMax = salarioMax;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
