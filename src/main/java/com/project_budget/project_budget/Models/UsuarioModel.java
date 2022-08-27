package com.project_budget.project_budget.Models;

import javax.persistence.*;
import javax.persistence.Id;
@Entity
@Table(name="usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String usuario; 
    private String contraseña;
    
    //relacion una a muchos con la tabla UsuarioModel
    @ManyToOne
    @JoinColumn(name="empleado_id",referencedColumnName="id", insertable=false, updatable=false)
    private EmpleadoModel empleado_id;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
