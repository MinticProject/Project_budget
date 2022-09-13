package com.project_budget.project_budget.Controllers;

import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;
import com.project_budget.project_budget.Models.MovimientoDineroModel;
import com.project_budget.project_budget.Services.MovimientoDineroService;

@RestController
public class MovimientoDineroController {

    MovimientoDineroService servicio;

    public MovimientoDineroController() {
        this.servicio = new MovimientoDineroService();
    }

    @GetMapping("/enterprises/movements")
    public ArrayList<MovimientoDineroModel> listarEmpresas(){
        return this.servicio.getLista();
    }

    @PostMapping("/enterprises/movements")
    public String crearMovimiento(@RequestBody MovimientoDineroModel x){
        return this.servicio.crearMovimiento(x);
    }

    @GetMapping("/enterprises/{id}/movements")
    public MovimientoDineroModel consultarUno(@PathVariable("id") Integer index){
        return this.servicio.buscarMovimiento(index-1);
    }

    @PatchMapping("/enterprises/{id}/movements")
    public String actualizarMovimiento(@PathVariable("id") Integer index,@RequestBody MovimientoDineroModel emp){
        return this.servicio.actualizarMovimiento(index-1,emp);
    }

    @DeleteMapping("/enterprises/{id}/movements")
    public String eliminarMovimiento(@PathVariable("id") Integer index){
        return this.servicio.eliminarMovimiento(index-1);
    }

}