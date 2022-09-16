package com.project_budget.project_budget.Services;


import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.project_budget.project_budget.Models.EmpleadoModel;
import com.project_budget.project_budget.Models.MovimientoDineroModel;

@Service
public class MovimientoDineroService {

     MovimientoDineroModel movimiento;

     ArrayList<MovimientoDineroModel> lista=new ArrayList<MovimientoDineroModel>();
 
     public MovimientoDineroService() { //Constructor
     this.datosIniciales();
     }
 
     public ArrayList<MovimientoDineroModel> getLista() { //Datos lista
         return lista;
     }
 
     public void datosIniciales(){
        EmpleadoService emp = new EmpleadoService();
        ArrayList<EmpleadoModel> listaEmp = emp.getLista();

        lista.add(new MovimientoDineroModel(1,200.0,"Pago Servicio Energia",listaEmp.get(0)));
     }
 
     public MovimientoDineroModel buscarMovimiento(int index){
         return lista.get(index);
     }
 
 
     public String crearMovimiento(MovimientoDineroModel p){
      lista.add(p);
      return "Movimiento Registrado Exitosamente";
     }
 
     public String actualizarMovimiento(int index, MovimientoDineroModel p){
         lista.set(index,p);
         return "Movimiento modificado Correctamente";
     }
 
     public String eliminarMovimiento(int index){
         lista.remove(index);
         return "Movimiento Eliminado";
     }
    
}
