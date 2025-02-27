package org.archu.jobmanagement.controller;

import org.archu.jobmanagement.model.Empresa;
import org.archu.jobmanagement.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public List<Empresa> getAllEmpresas() {
        return empresaService.getAllEmpresas();
    }

    @GetMapping("/{id}")
    public Optional<Empresa> getEmpresaById(@PathVariable Long id) {
        return empresaService.getEmpresaById(id);
    }

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.createEmpresa(empresa);
    }

    @PutMapping("/{id}")
    public Empresa updateEmpresa(@PathVariable Long id, @RequestBody Empresa empresaDetails) {
        return empresaService.updateEmpresa(id, empresaDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEmpresa(@PathVariable Long id) {
        empresaService.deleteEmpresa(id);
    }
}
