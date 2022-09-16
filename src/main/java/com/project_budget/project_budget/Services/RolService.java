package com.project_budget.project_budget.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.project_budget.project_budget.Models.RolModel;

@Service
public class RolService {
    
    //RolController Rol;
    RolModel Rol;

    ArrayList<RolModel> lista=new ArrayList<RolModel>();

    public RolService() { //Constructor
    this.datosIniciales();
    }

    public ArrayList<RolModel> getLista() { //Datos lista
        return lista;
    }

    public void datosIniciales(){
    lista.add(new RolModel(1,"Administrador"));
    lista.add(new RolModel(2,"Operario"));
    }

    public RolModel buscarRol(int index){
        return lista.get(index-1);
    }


    public String crearRol(RolModel p){
     lista.add(p);
     return "Rol Registrado Exitosamente";
    }

    public String actualizarRol(int index, RolModel p){
        lista.set(index-1,p);
        return "Rol modificado Correctamente";
    }

    public String eliminarRol(int index){
        lista.remove(index-1);
        return "Rol Eliminado";
    }
}
