package com.project_budget.project_budget.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.project_budget.project_budget.Models.EmpleadoModel;
import com.project_budget.project_budget.Models.EmpresaModel;
import com.project_budget.project_budget.Models.RolModel;

@Service
public class EmpleadoService {
    //EmpleadoController Empleado;
    EmpleadoModel Empleado;

    ArrayList<EmpleadoModel> lista=new ArrayList<EmpleadoModel>();

    public EmpleadoService() { //Constructor
    this.datosIniciales();
    }

    public ArrayList<EmpleadoModel> getLista() { //Datos lista
        return lista;
    }

    public void datosIniciales(){

        RolService rol = new RolService();
       ArrayList<RolModel> listaRol = rol.getLista();

       EmpresaService emp = new EmpresaService();
       ArrayList<EmpresaModel> listaEmp = emp.getLista();
        
    lista.add(new EmpleadoModel(1,"Jorge Montes","jooge1998@gmail.com",listaEmp.get(0),listaRol.get(0)));

    }

    public EmpleadoModel buscarEmpleado(int index){
        return lista.get(index -1);
    }


    public String crearEmpleado(EmpleadoModel p){
     lista.add(p);
     return "Empleado Registrada Exitosamente";
    }

    public String actualizarEmpleado(int index, EmpleadoModel p){
        lista.set(index-1,p);
        return "Empleado modificado Correctamente";
    }

    public String eliminarEmpleado(int index){
        lista.remove(index-1);
        return "Empleado Eliminada";
    }
}
