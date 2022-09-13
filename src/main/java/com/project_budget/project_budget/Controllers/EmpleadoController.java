package com.project_budget.project_budget.Controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

import com.project_budget.project_budget.Models.EmpleadoModel;
import com.project_budget.project_budget.Services.EmpleadoService;

@RestController
public class EmpleadoController {
    
    EmpleadoService servicio;

    public EmpleadoController() {
        this.servicio = new EmpleadoService();
    }

    @GetMapping("/users")
    public ArrayList<EmpleadoModel> listarEmpresas(){
        return this.servicio.getLista();
    }

    @PostMapping("/users")
    public String crearEmpleado(@RequestBody EmpleadoModel x){
        return this.servicio.crearEmpleado(x);
    }

    @GetMapping("/users/{id}")
    public EmpleadoModel consultarUno(@PathVariable("id") Integer index){
        return this.servicio.buscarEmpleado(index-1);
    }

    @PatchMapping("/users/{id}")
    public String actualiza(@PathVariable("id") Integer index,@RequestBody EmpleadoModel emp){
        return this.servicio.actualizarEmpleado(index-1,emp);
    }

    @DeleteMapping("/users/{id}")
    public String eliminar(@PathVariable("id") Integer index){
        return this.servicio.eliminarEmpleado(index-1);
    }
}
