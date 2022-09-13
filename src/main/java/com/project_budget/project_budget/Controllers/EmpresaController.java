package com.project_budget.project_budget.Controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;
import com.project_budget.project_budget.Models.EmpresaModel;
import com.project_budget.project_budget.Services.EmpresaService;

@RestController
public class EmpresaController {

    EmpresaService servicio;

    public EmpresaController() {
        this.servicio = new EmpresaService();
    }

    @GetMapping("/enterprises")
    public ArrayList<EmpresaModel> listarEmpresas() {
        return this.servicio.getLista();
    }

    @PostMapping("/enterprises")
    public String crearEmpresa(@RequestBody EmpresaModel x) {
        return this.servicio.crearEmpresa(x);
    }

    @GetMapping("/enterprises/{id}")
    public EmpresaModel consultarUno(@PathVariable("id") Integer index) {
        return this.servicio.buscarEmpresa(index - 1);
    }

    @PatchMapping("/enterprises/{id}")
    public String actualiza(@PathVariable("id") Integer index, @RequestBody EmpresaModel emp) {
        return this.servicio.actualizarEmpresa(index - 1, emp);
    }

    @DeleteMapping("/enterprises/{id}")
    public String eliminar(@PathVariable("id") Integer index) {
        return this.servicio.eliminarEmpresa(index - 1);
    }
}
