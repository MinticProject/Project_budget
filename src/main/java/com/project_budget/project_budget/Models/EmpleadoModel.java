package com.project_budget.project_budget.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

    //relacion una a muchos con la tabla RolModel
    //administrativo u operativo
    @ManyToOne
    @JoinColumn(name="rol_id",referencedColumnName="id", insertable=false, updatable=false)
    private RolModel rol_id;

    //Relacion con la tabla Usuario
    @OneToMany(mappedBy = "empleado_id")
    private List<UsuarioModel> usuario;

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

    public RolModel getRol_id() {
        return rol_id;
    }

    public void setRol_id(RolModel rol_id) {
        this.rol_id = rol_id;
    }

}
