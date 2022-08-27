package com.project_budget.project_budget;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class EmpleadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String nombre;
    private String correo;

    //relacion una a muchos con la tabla empresa
    @ManyToOne
    @JoinColumn(name="empresa_id",referencedColumnName="id", insertable=false, updatable=false)
    private EmpresaModel empresa_id;
    
    //administrativo u operativo
    private String rol;

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public EmpresaModel getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(EmpresaModel empresa_id) {
        this.empresa_id = empresa_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   

   

   

    
    
}
