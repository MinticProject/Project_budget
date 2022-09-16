package com.project_budget.project_budget.Services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.project_budget.project_budget.Models.EmpresaModel;

@Service
public class EmpresaService {
    
    //EmpresaController empresa;
    EmpresaModel empresa;

    ArrayList<EmpresaModel> lista=new ArrayList<EmpresaModel>();

    public EmpresaService() { //Constructor
    this.datosIniciales();
    }

    public ArrayList<EmpresaModel> getLista() { //Datos lista
        return lista;
    }

    public void datosIniciales(){
    lista.add(new EmpresaModel(1,"CellStar","Cll 43 #6-57",9662131,"543242-9"));
    lista.add(new EmpresaModel(2,"SismaSalud","Cll 54 #6-57",9662131,"543242-9"));
    lista.add(new EmpresaModel(3,"CompuLago","Cll 13 #6d-42",9662131,"543242-9"));
    lista.add(new EmpresaModel(4,"Norma","Cll 31 #6w-37",9662131,"543242-9"));
    lista.add(new EmpresaModel(5,"Afinia","Cll 77 #87-7",9662131,"543242-9"));
    }

    public EmpresaModel buscarEmpresa(int index){
        return lista.get(index-1);
    }


    public String crearEmpresa(EmpresaModel p){
     lista.add(p);
     return "Empresa Registrada Exitosamente";
    }

    public String actualizarEmpresa(int index, EmpresaModel p){
        lista.set(index-1,p);
        return "Empresa modificado Correctamente";
    }

    public String eliminarEmpresa(int index){
        lista.remove(index-1);
        return "Empresa Eliminada";
    }

 
}
